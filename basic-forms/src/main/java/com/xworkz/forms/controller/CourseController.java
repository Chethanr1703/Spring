package com.xworkz.forms.controller;

import com.xworkz.forms.dto.CourseDTO;
import com.xworkz.forms.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    public ModelAndView loadForm() {
        ModelAndView mv = new ModelAndView("Course");
        mv.addObject("course", new CourseDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid CourseDTO dto, BindingResult br) {
        ModelAndView mv = new ModelAndView();

        if (br.hasErrors()) {

            if (br.hasFieldErrors("name"))
                mv.addObject("nameError", br.getFieldError("name").getDefaultMessage());

            if (br.hasFieldErrors("code"))
                mv.addObject("codeError", br.getFieldError("code").getDefaultMessage());

            if (br.hasFieldErrors("duration"))
                mv.addObject("durationError", br.getFieldError("duration").getDefaultMessage());

            if (br.hasFieldErrors("instructor"))
                mv.addObject("instructorError", br.getFieldError("instructor").getDefaultMessage());

            if (br.hasFieldErrors("category"))
                mv.addObject("categoryError", br.getFieldError("category").getDefaultMessage());

            if (br.hasFieldErrors("level"))
                mv.addObject("levelError", br.getFieldError("level").getDefaultMessage());

            if (br.hasFieldErrors("fees"))
                mv.addObject("feesError", br.getFieldError("fees").getDefaultMessage());

            mv.addObject("course", dto);
            mv.setViewName("Course");
            return mv;
        }

        service.save(dto);
        mv.addObject("success", "Course registered successfully");
        mv.addObject("course", new CourseDTO());
        mv.setViewName("Course");
        return mv;
    }
}
