package com.xworkz.forms.controller;

import com.xworkz.forms.dto.FeedbackDTO;
import com.xworkz.forms.service.feedback.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService service;

    @GetMapping
    public ModelAndView load() {
        ModelAndView mv = new ModelAndView("Feedback");
        mv.addObject("feedback", new FeedbackDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid FeedbackDTO dto, BindingResult br) {

        ModelAndView mv = new ModelAndView("Feedback");
        mv.addObject("feedback", dto);

        if (br.hasErrors()) {

            if (br.hasFieldErrors("name"))
                mv.addObject("nameError", br.getFieldError("name").getDefaultMessage());

            if (br.hasFieldErrors("email"))
                mv.addObject("emailError", br.getFieldError("email").getDefaultMessage());

            if (br.hasFieldErrors("phone"))
                mv.addObject("phoneError", br.getFieldError("phone").getDefaultMessage());

            if (br.hasFieldErrors("subject"))
                mv.addObject("subjectError", br.getFieldError("subject").getDefaultMessage());

            if (br.hasFieldErrors("rating"))
                mv.addObject("ratingError", br.getFieldError("rating").getDefaultMessage());

            if (br.hasFieldErrors("message"))
                mv.addObject("messageError", br.getFieldError("message").getDefaultMessage());

            return mv;
        }

        service.save(dto);
        mv.addObject("success", "Feedback Submitted Successfully");
        mv.addObject("feedback", new FeedbackDTO());
        return mv;
    }
}
