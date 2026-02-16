package com.xworkz.modules.controller;

import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.service.ModuleService;
import com.xworkz.modules.service.teamEmail.TeamEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TeamEmailController {

    @Autowired
    ModuleService moduleService;

    @Autowired
    TeamEmailService teamEmailService;

    @GetMapping("/sendTeamMailPage")
    public String loadMailPage(Model model) {

        List<AddTeamDTO> teams = moduleService.getTeam();
        model.addAttribute("teams", teams);

        return "sendTeamMailPage";
    }


    @PostMapping("/sendTeamMail")
    public String sendMailToTeam(
            @RequestParam String teamName,
            @RequestParam String message,
            Model model) {


        boolean isSent = teamEmailService.sendMailToTeam(teamName, message);

        if (isSent) {
            model.addAttribute("msg", "Email sent successfully!");
        } else {
            model.addAttribute("error", "Failed to send email.");
        }

        return "sendTeamMailPage";
    }


}
