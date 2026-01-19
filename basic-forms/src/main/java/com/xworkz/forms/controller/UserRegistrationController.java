package com.xworkz.forms.controller;

import com.xworkz.forms.dto.UserRegistrationDTO;
import com.xworkz.forms.service.user.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/userRegistration")
public class UserRegistrationController {

    @Autowired
    private UserRegistrationService service;

    @GetMapping
    public ModelAndView load() {
        ModelAndView mv = new ModelAndView("UserRegistration");
        mv.addObject("user", new UserRegistrationDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid UserRegistrationDTO dto, BindingResult br) {
        ModelAndView mv = new ModelAndView("UserRegistration");
        mv.addObject("user", dto);

        if (br.hasErrors()) {
            if (br.hasFieldErrors("firstName"))
                mv.addObject("firstNameError", br.getFieldError("firstName").getDefaultMessage());
            if (br.hasFieldErrors("lastName"))
                mv.addObject("lastNameError", br.getFieldError("lastName").getDefaultMessage());
            if (br.hasFieldErrors("email"))
                mv.addObject("emailError", br.getFieldError("email").getDefaultMessage());
            if (br.hasFieldErrors("phoneNo"))
                mv.addObject("phoneNoError", br.getFieldError("phoneNo").getDefaultMessage());
            if (br.hasFieldErrors("dob"))
                mv.addObject("dobError", br.getFieldError("dob").getDefaultMessage());
            if (br.hasFieldErrors("gender"))
                mv.addObject("genderError", br.getFieldError("gender").getDefaultMessage());
            if (br.hasFieldErrors("address"))
                mv.addObject("addressError", br.getFieldError("address").getDefaultMessage());
            if (br.hasFieldErrors("city"))
                mv.addObject("cityError", br.getFieldError("city").getDefaultMessage());
            if (br.hasFieldErrors("state"))
                mv.addObject("stateError", br.getFieldError("state").getDefaultMessage());
            if (br.hasFieldErrors("country"))
                mv.addObject("countryError", br.getFieldError("country").getDefaultMessage());

            return mv;
        }

        service.save(dto);
        mv.addObject("success", "User Registration Saved Successfully");
        mv.addObject("user", new UserRegistrationDTO());
        return mv;
    }
}
