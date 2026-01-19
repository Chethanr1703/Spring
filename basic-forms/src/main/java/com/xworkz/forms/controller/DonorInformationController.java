package com.xworkz.forms.controller;

import com.xworkz.forms.dto.DonorInformationDTO;
import com.xworkz.forms.service.donor.DonorInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/donor")
public class DonorInformationController {

    @Autowired
    private DonorInformationService service;

    @GetMapping
    public ModelAndView load() {
        ModelAndView mv = new ModelAndView("DonorInformation");
        mv.addObject("donor", new DonorInformationDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid DonorInformationDTO dto, BindingResult br) {
        ModelAndView mv = new ModelAndView("DonorInformation");
        mv.addObject("donor", dto);

        if (br.hasErrors()) {
            if (br.hasFieldErrors("donorName"))
                mv.addObject("donorNameError", br.getFieldError("donorName").getDefaultMessage());

            if (br.hasFieldErrors("email"))
                mv.addObject("emailError", br.getFieldError("email").getDefaultMessage());

            if (br.hasFieldErrors("phone"))
                mv.addObject("phoneError", br.getFieldError("phone").getDefaultMessage());

            if (br.hasFieldErrors("bloodGroup"))
                mv.addObject("bloodGroupError", br.getFieldError("bloodGroup").getDefaultMessage());

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
        mv.addObject("success", "Donor Information Saved Successfully");
        mv.addObject("donor", new DonorInformationDTO());
        return mv;
    }
}
