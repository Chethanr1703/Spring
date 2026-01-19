package com.xworkz.forms.controller;

import com.xworkz.forms.dto.EmployeeDTO;
import com.xworkz.forms.dto.ProductDTO;
import com.xworkz.forms.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/product")
    public String showForm(Model model) {
        model.addAttribute("product", new EmployeeDTO());
        return "Product";
    }

    @GetMapping
    public ModelAndView loadForm() {
        ModelAndView mv = new ModelAndView("Product");
        mv.addObject("product", new ProductDTO());
        return mv;
    }

    @PostMapping
    public ModelAndView save(@Valid ProductDTO dto, BindingResult br) {
        ModelAndView mv = new ModelAndView();

        if (br.hasErrors()) {

            if (br.hasFieldErrors("name"))
                mv.addObject("nameError", br.getFieldError("name").getDefaultMessage());

            if (br.hasFieldErrors("brand"))
                mv.addObject("brandError", br.getFieldError("brand").getDefaultMessage());

            if (br.hasFieldErrors("category"))
                mv.addObject("categoryError", br.getFieldError("category").getDefaultMessage());

            if (br.hasFieldErrors("price"))
                mv.addObject("priceError", br.getFieldError("price").getDefaultMessage());

            if (br.hasFieldErrors("quantity"))
                mv.addObject("quantityError", br.getFieldError("quantity").getDefaultMessage());

            if (br.hasFieldErrors("warranty"))
                mv.addObject("warrantyError", br.getFieldError("warranty").getDefaultMessage());

            if (br.hasFieldErrors("color"))
                mv.addObject("colorError", br.getFieldError("color").getDefaultMessage());

            if (br.hasFieldErrors("description"))
                mv.addObject("descriptionError", br.getFieldError("description").getDefaultMessage());

            mv.addObject("product", dto);
            mv.setViewName("Product");
            return mv;
        }

        service.save(dto);
        mv.addObject("success", "Product saved successfully");
        mv.addObject("product", new ProductDTO());
        mv.setViewName("Product");
        return mv;
    }
}
