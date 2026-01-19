package com.xworkz.forms.controller;

import com.xworkz.forms.dto.BankAccountDTO;
import com.xworkz.forms.service.bankaccount.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/bank")
public class BankAccountController {

    @Autowired
    private BankAccountService service;

    @GetMapping
    public ModelAndView load() {
        ModelAndView mv = new ModelAndView("BankAccount");
        mv.addObject("bank", new BankAccountDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid BankAccountDTO dto, BindingResult br) {

        ModelAndView mv = new ModelAndView("BankAccount");

        mv.addObject("bank", dto);

        if (br.hasErrors()) {

            if (br.hasFieldErrors("holderName"))
                mv.addObject("holderNameError", br.getFieldError("holderName").getDefaultMessage());

            if (br.hasFieldErrors("accountNo"))
                mv.addObject("accountNoError", br.getFieldError("accountNo").getDefaultMessage());

            if (br.hasFieldErrors("ifsc"))
                mv.addObject("ifscError", br.getFieldError("ifsc").getDefaultMessage());

            if (br.hasFieldErrors("bankName"))
                mv.addObject("bankNameError", br.getFieldError("bankName").getDefaultMessage());

            if (br.hasFieldErrors("branch"))
                mv.addObject("branchError", br.getFieldError("branch").getDefaultMessage());

            if (br.hasFieldErrors("aadhaar"))
                mv.addObject("aadhaarError", br.getFieldError("aadhaar").getDefaultMessage());

            if (br.hasFieldErrors("pan"))
                mv.addObject("panError", br.getFieldError("pan").getDefaultMessage());

            if (br.hasFieldErrors("balance"))
                mv.addObject("balanceError", br.getFieldError("balance").getDefaultMessage());

            return mv;
        }

        service.save(dto);
        mv.addObject("success", "Bank Account Registered Successfully");
        mv.addObject("bank", new BankAccountDTO());
        return mv;
    }

}
