package com.xworkz.modules.controller;

import com.xworkz.modules.dao.event.EventDAO;
import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.entity.event.TeamEventResponseEntity;
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

    @Autowired
    EventDAO eventDAO;

    @GetMapping("/sendTeamMailPage")
    public String loadMailPage(Model model) {

        List<AddTeamDTO> teams = moduleService.getTeam();
        model.addAttribute("teams", teams);

        return "sendTeamMailPage";
    }


    @PostMapping("/createEvent")
    public String createEvent(
            @RequestParam String teamName,
            @RequestParam String title,
            @RequestParam String message,
            Model model) {

        boolean sent =
                teamEmailService.createEventAndSendMail(teamName, title, message);

        if (sent) {
            model.addAttribute("msg", "Event Created & Email Sent Successfully!");
        } else {
            model.addAttribute("error", "Failed to send emails.");
        }

        return "sendTeamMailPage";
    }


    @GetMapping("/eventResponsePage")
    public String loadResponsePage(
            @RequestParam int eventId,
            @RequestParam String email,
            Model model) {

        model.addAttribute("eventId", eventId);
        model.addAttribute("email", email);

        return "eventResponsePage";
    }



    @PostMapping("/submitResponse")
    public String saveResponse(
            @RequestParam int eventId,
            @RequestParam String email,
            @RequestParam String response,
            Model model) {

        boolean isResponded=teamEmailService.saveResponse(eventId, email, response);
        if(isResponded) {

            model.addAttribute("msg", "Your response has been recorded!");
        } else {
            model.addAttribute("error", "Your response already recorded you cannot change.");
        }


        return "eventResponsePage";
    }



}
