package com.xworkz.modules.controller;

import com.xworkz.modules.dto.SignupDTO;
import com.xworkz.modules.exception.UserNotFounException;
import com.xworkz.modules.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class ModuleController {

    @Autowired
    ModuleService moduleService;


    @GetMapping("signUp")
    public String signUp() {
        return "signUp";
    }

    @GetMapping("/signIn")
    public String signIn() {
        return "signIn";
    }

    @RequestMapping("/SignInWithOTP")
    public String getSignInWithOTP() {
        return "SignInWithOTP";
    }




    @PostMapping("/signUp")
    public ModelAndView createAccount(@Valid SignupDTO signupDTO, BindingResult bindingResult, ModelAndView mv) {

//
//        mv.addObject("dto", signupDTO);
//
//
//        if (bindingResult.hasErrors()) {
//            if (bindingResult.hasFieldErrors("name")) {
//                mv.addObject("nameError",
//                        bindingResult.getFieldError("name").getDefaultMessage());
//            }
//            if (bindingResult.hasFieldErrors("email")) {
//                mv.addObject("emailError",
//                        bindingResult.getFieldError("email").getDefaultMessage());
//            }
//            if (bindingResult.hasFieldErrors("phone")) {
//                mv.addObject("phoneError",
//                        bindingResult.getFieldError("phone").getDefaultMessage());
//            }
//            if (bindingResult.hasFieldErrors("age")) {
//                mv.addObject("ageError",
//                        bindingResult.getFieldError("age").getDefaultMessage());
//            }
//            if (bindingResult.hasFieldErrors("gender")) {
//                mv.addObject("genderError",
//                        bindingResult.getFieldError("gender").getDefaultMessage());
//            }
//            if (bindingResult.hasFieldErrors("address")) {
//                mv.addObject("addressError",
//                        bindingResult.getFieldError("address").getDefaultMessage());
//            }
//            if (bindingResult.hasFieldErrors("password")) {
//                mv.addObject("passwordError",
//                        bindingResult.getFieldError("password").getDefaultMessage());
//            }
//            if (bindingResult.hasFieldErrors("confirmPassword")) {
//                mv.addObject("confirmPasswordError",
//                        bindingResult.getFieldError("confirmPassword").getDefaultMessage());
//            }
//            return mv;
//        }
//
//
//        if (!signupDTO.getPassword().equals(signupDTO.getConfirmPassword())) {
//            mv.addObject("confirmPasswordError", "Passwords do not match");
//            return mv;
//        }
//

        boolean saved = moduleService.validateAndSave(signupDTO);

        if (saved) {
            mv.setViewName("signIn");
            mv.addObject("msg", "Account created successfully");
            mv.addObject("dto", new SignupDTO());
        } else {
            mv.addObject("error", "Email already exists");
        }
        return mv;
    }

    @PostMapping("/login")
    public String getSignIn(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) throws UserNotFounException {
        boolean valid = true;
        SignupDTO signupDTO = moduleService.validateLogin(email, password);

        if (valid) {
            moduleService.setCountToZero(email);
            session.setAttribute("user", signupDTO);
            return "Home";
        } else {
            int count = moduleService.getCount(email);
            model.addAttribute("email", email);
            System.out.println(count);
            if (count >= 2) {
                model.addAttribute("disableLogin", true);
                model.addAttribute("showForgot", true);
                return "signIn";
            } else {
                moduleService.updateCount(email);
                model.addAttribute("errorMsg", "Password is not valid");
            }
            model.addAttribute("error", "Invalid email or password");
            return "signIn";
        }


    }

    @PostMapping("sendOTP")
    public String sendOtp(@RequestParam String email, Model model) {
        System.out.println(email);
        boolean isSaved = moduleService.sendOtp(email);
        model.addAttribute("email", email);
        model.addAttribute("otpSent", isSaved);

        if (isSaved) {
            System.out.println("true");
            model.addAttribute("msg", "OTP sent successfully ");

        } else {
            System.out.println("false");
            model.addAttribute("msgUnsuccess", "OTP is not sent  ");

        }
        return "SignInWithOTP";
    }

    @PostMapping("signInWithOTP")
    public String validateOtpLogin(@RequestParam String email, @RequestParam String otp, Model model) {
        System.out.println(email + "   " + otp);
        model.addAttribute("email", email);
        boolean isValidateLogin = moduleService.checkOptLogin(email, otp);
        if (isValidateLogin) {
            return "signInUpdatePassword";
        } else {
            model.addAttribute("wrongOTP", "OTP invalid or expired");
            model.addAttribute("showResend", true);
            return "SignInWithOTP";
        }
    }


    @PostMapping("resetPassword")
    public  String updatePassword(@RequestParam String email ,String newPassword ,String confirmPassword,Model model){
        System.out.println(email+"   "+ newPassword +"    "+ confirmPassword);
        boolean isPasswordMatch =moduleService.validateNewPassword(email,newPassword,confirmPassword);
        if(isPasswordMatch){
            return "signIn";
        }else {
            model.addAttribute("misMatchPassword", "Password does not Match");
            return "signInUpdatePassword";
        }
    }
}
