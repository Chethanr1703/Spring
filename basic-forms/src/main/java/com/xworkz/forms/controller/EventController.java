package com.xworkz.forms.controller;


import com.xworkz.forms.dto.EventRegistrationDTO;
import com.xworkz.forms.service.event.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService service;

    @GetMapping
    public ModelAndView load() {
        ModelAndView mv = new ModelAndView("Event");
        mv.addObject("event", new EventRegistrationDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid EventRegistrationDTO dto, BindingResult br) {

        ModelAndView mv = new ModelAndView("Event");
        mv.addObject("event", dto);

        if (br.hasErrors()) {

            if (br.hasFieldErrors("name"))
                mv.addObject("nameError", br.getFieldError("name").getDefaultMessage());

            if (br.hasFieldErrors("email"))
                mv.addObject("emailError", br.getFieldError("email").getDefaultMessage());

            if (br.hasFieldErrors("phone"))
                mv.addObject("phoneError", br.getFieldError("phone").getDefaultMessage());

            if (br.hasFieldErrors("eventName"))
                mv.addObject("eventNameError", br.getFieldError("eventName").getDefaultMessage());

            if (br.hasFieldErrors("location"))
                mv.addObject("locationError", br.getFieldError("location").getDefaultMessage());

            if (br.hasFieldErrors("date"))
                mv.addObject("dateError", br.getFieldError("date").getDefaultMessage());

            return mv;
        }

        service.save(dto);
        mv.addObject("success", "Event Registered Successfully");
        mv.addObject("event", new EventRegistrationDTO());
        return mv;
    }
}
