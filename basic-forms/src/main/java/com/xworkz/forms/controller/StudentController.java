package com.xworkz.forms.controller;

import com.xworkz.forms.dto.StudentDTO;
import com.xworkz.forms.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping
    public ModelAndView load() {
        ModelAndView mv = new ModelAndView("student");
        mv.addObject("studentDTO", new StudentDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid StudentDTO dto, BindingResult br) {

        ModelAndView mv = new ModelAndView();

        if (br.hasErrors()) {

            if (br.hasFieldErrors("name"))
                mv.addObject("nameError", br.getFieldError("name").getDefaultMessage());

            if (br.hasFieldErrors("email"))
                mv.addObject("emailError", br.getFieldError("email").getDefaultMessage());

            if (br.hasFieldErrors("phone"))
                mv.addObject("phoneError", br.getFieldError("phone").getDefaultMessage());

            if (br.hasFieldErrors("age"))
                mv.addObject("ageError", br.getFieldError("age").getDefaultMessage());

            if (br.hasFieldErrors("college"))
                mv.addObject("collegeError", br.getFieldError("college").getDefaultMessage());

            if (br.hasFieldErrors("branch"))
                mv.addObject("branchError", br.getFieldError("branch").getDefaultMessage());

            if (br.hasFieldErrors("semester"))
                mv.addObject("semesterError", br.getFieldError("semester").getDefaultMessage());

            if (br.hasFieldErrors("city"))
                mv.addObject("cityError", br.getFieldError("city").getDefaultMessage());

            mv.setViewName("student");
            return mv;
        }

        service.save(dto);
        mv.addObject("success", "Student Registered Successfully");
        mv.addObject("studentDTO", new StudentDTO());
        mv.setViewName("student");
        return mv;
    }
}
