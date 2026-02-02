package com.xworkz.modules.controller;

import com.xworkz.modules.dto.SignupDTO;
import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping("/home")
    public String home(HttpSession session) {

        if (session.getAttribute("user") == null) {
            return "redirect:/signIn";
        }

        return "Home";
    }

    @PostMapping("/update-profile")
    public String updateProfile(@RequestParam String email, @RequestParam String phone, @RequestParam int age, @RequestParam String address, HttpSession session, Model model) {

        boolean updated = profileService.updateProfile(email, phone, age, address);

        SignupDTO user = profileService.getUserByEmail(email);
        session.setAttribute("user", user);
//        model.addAttribute("user", user);

        if (updated) {
            model.addAttribute("profileMsg", "Profile updated successfully");
        } else {
            model.addAttribute("profileError", "Profile not updated. Try again.");
        }

        model.addAttribute("openEditProfile", true);
        return "Home";
    }


    @PostMapping("/change-password")
    public String changePassword(@RequestParam String newPassword,
                                 @RequestParam String confirmPassword, HttpSession session,
                                 RedirectAttributes redirectAttributes) {

        SignupDTO user = (SignupDTO) session.getAttribute("user");

        if (user == null) {
            return "redirect:/signIn";
        }

        String result = profileService.changePassword(
                user.getEmail(), newPassword, confirmPassword
        );

        if (!"SUCCESS".equals(result)) {
            redirectAttributes.addFlashAttribute("errorMsg", result);
            redirectAttributes.addFlashAttribute("openChangePassword", true);
            return "redirect:/Home";
        }

        session.invalidate();
        redirectAttributes.addFlashAttribute("msg", "Password changed successfully. Please login.");
        return "redirect:/signIn?email=" + user.getEmail();
    }


    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/signin";
    }

}
