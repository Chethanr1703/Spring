package com.xworkz.forms.controller;

import com.xworkz.forms.dto.EmployeeDTO;
import com.xworkz.forms.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employee")
    public String showForm(Model model) {
        model.addAttribute("employee", new EmployeeDTO());
        return "Employee";
    }

    @GetMapping
    public ModelAndView loadForm() {
        ModelAndView mv = new ModelAndView("Employee");
        mv.addObject("employee", new EmployeeDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid @ModelAttribute("employee") EmployeeDTO dto, BindingResult br) {
        ModelAndView mv = new ModelAndView("Employee");

        if (br.hasErrors()) {
            mv.addObject("nameError", br.hasFieldErrors("name") ? br.getFieldError("name").getDefaultMessage() : "");
            mv.addObject("emailError", br.hasFieldErrors("email") ? br.getFieldError("email").getDefaultMessage() : "");
            mv.addObject("phoneError", br.hasFieldErrors("phone") ? br.getFieldError("phone").getDefaultMessage() : "");
            mv.addObject("departmentError", br.hasFieldErrors("department") ? br.getFieldError("department").getDefaultMessage() : "");
            mv.addObject("designationError", br.hasFieldErrors("designation") ? br.getFieldError("designation").getDefaultMessage() : "");
            mv.addObject("salaryError", br.hasFieldErrors("salary") ? br.getFieldError("salary").getDefaultMessage() : "");
            mv.addObject("experienceError", br.hasFieldErrors("experience") ? br.getFieldError("experience").getDefaultMessage() : "");

            mv.addObject("employee", dto);
            return mv;
        }

        service.save(dto);
        mv.addObject("success", "Employee Registered Successfully!");
        mv.addObject("employee", new EmployeeDTO());
        return mv;
    }
}
