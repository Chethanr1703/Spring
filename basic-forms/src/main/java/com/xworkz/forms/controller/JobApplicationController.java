package com.xworkz.forms.controller;

import com.xworkz.forms.dto.JobApplicationDTO;
import com.xworkz.forms.service.jobapplication.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/job")
public class JobApplicationController {

    @Autowired
    private JobApplicationService service;

    @GetMapping
    public ModelAndView load() {
        ModelAndView mv = new ModelAndView("JobApplication");
        mv.addObject("job", new JobApplicationDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid JobApplicationDTO dto, BindingResult br) {

        ModelAndView mv = new ModelAndView("JobApplication");
        mv.addObject("job", dto);

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

            if (br.hasFieldErrors("qualification"))
                mv.addObject("qualificationError", br.getFieldError("qualification").getDefaultMessage());

            if (br.hasFieldErrors("experience"))
                mv.addObject("experienceError", br.getFieldError("experience").getDefaultMessage());

            return mv;
        }

        service.save(dto);
        mv.addObject("success", "Job Application Submitted Successfully");
        mv.addObject("job", new JobApplicationDTO());
        return mv;
    }
}
