package com.xworkz.modules.controller;

import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.dto.AddTeamMemberDTO;
import com.xworkz.modules.entity.AddTeamEntity;
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

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomePageController {

    @Autowired
    ModuleService moduleService;

    @GetMapping("addTeam")
    public String addTeam() {
        return "addTeamForm";
    }

    @GetMapping("addTeamMember")
    public String addTeamMember(){
        return "addTeamMemberForm";
    }

    @GetMapping("viewTeamMembers")
    public  String viewTeamMember(){
        return "viewTeamMembers";
    }

    @GetMapping("getTeamMembers")
    public String getTeamMember(@RequestParam String teamName,Model model){
        System.out.println(teamName);
        List<AddTeamMemberDTO> addTeamDTOS = moduleService.getTeamMemberByTeamName(teamName);
        System.out.println(addTeamDTOS);
        if(addTeamDTOS!=null){
            model.addAttribute("members", addTeamDTOS);
            return "viewTeamMembers";
        }else {
            model.addAttribute("noTeams","No Teams Found");
            return "viewTeamMembers";
        }

    }


    @GetMapping("viewTeams")
    public  String viewTeam(Model model){

        List<AddTeamDTO> members = moduleService.getTeam();
        System.out.println(members);
        if(members!=null){
            model.addAttribute("members", members);
            return "viewTeams";
        }else {
            model.addAttribute("noTeams","No Teams Found");
            return "Home";
        }


    }


    @PostMapping("addTeam")
    public ModelAndView addTeams(@Valid AddTeamDTO addTeamDTO, BindingResult bindingResult, ModelAndView mv){
        mv.addObject("dto", addTeamDTO);

        if (bindingResult.hasErrors()) {

            if (bindingResult.hasFieldErrors("teamName")) {
                mv.addObject("teamNameError",
                        bindingResult.getFieldError("teamName").getDefaultMessage());
            }

            if (bindingResult.hasFieldErrors("teamHeadName")) {
                mv.addObject("teamHeadNameError",
                        bindingResult.getFieldError("teamHeadName").getDefaultMessage());
            }

            if (bindingResult.hasFieldErrors("phone")) {
                mv.addObject("phoneError",
                        bindingResult.getFieldError("phone").getDefaultMessage());
            }

            if (bindingResult.hasFieldErrors("email")) {
                mv.addObject("emailError",
                        bindingResult.getFieldError("email").getDefaultMessage());
            }

            if (bindingResult.hasFieldErrors("noOfTeamMember")) {
                mv.addObject("noOfTeamMemberError",
                        bindingResult.getFieldError("noOfTeamMember").getDefaultMessage());
            }

            mv.setViewName("addTeamForm");
            return mv;
        }

        boolean saveTeam =moduleService.saveTeam(addTeamDTO);
        if(saveTeam) {
            mv.addObject("msg", "Team added successfully");
            mv.setViewName("addTeamForm");
            return mv;
        }else {
            mv.addObject("error", "Team is Not Added Check Email");
            mv.setViewName("addTeamForm");
            return mv;
        }
    }

    @PostMapping("addTeamMember")
    public ModelAndView addTeamMember(@Valid AddTeamMemberDTO addTeamMemberDTO, BindingResult result, ModelAndView mv){
        if (result.hasErrors()) {
            mv.addObject("error", "Invalid input");
            mv.setViewName("addTeamMemberForm");
            return mv;
        }
        boolean saved = moduleService.addTeamMember(addTeamMemberDTO);

        if (saved) {
            mv.addObject("msg", "Team member added successfully");
        } else {
            mv.addObject("error", "Invalid Team Head Email");
        }
        mv.setViewName("addTeamMemberForm");
        return mv;


    }


    }


