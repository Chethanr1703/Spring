package com.xworkz.job.controller;

import com.xworkz.job.dto.ApplicationFormDTO;
import com.xworkz.job.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ApplicationFormController {

    @Autowired
    FormService formService;


    public ApplicationFormController() {
        System.out.println("Application Form Controller object is created");
    }

    @PostMapping("saveForm")
    public String saveApplicationForm(ApplicationFormDTO applicationFormDTO) {
        System.out.println(applicationFormDTO);
        boolean isSaved = formService.validateForm(applicationFormDTO);
        if (isSaved) {
            return "SuccessFull";
        } else {
            return "Error";
        }
    }

    @GetMapping("getProfile")
    public String getProfile( String email,Model model){
        System.out.println(email);
        ApplicationFormDTO applicationFormDTO = formService.getApplication(email);
        model.addAttribute("application",applicationFormDTO);
        if(applicationFormDTO!=null) return "Profile";
        else return "ProfileNotRegister";
    }

    @GetMapping("editProfile/{email}")
    public String getApplicationForEdit(@PathVariable("email") String email ,Model model){
        ApplicationFormDTO applicationFormDTO = formService.getApplication(email);
        model.addAttribute("application",applicationFormDTO);
        return "UpdateProfile";
    }

    @PostMapping("updateApplication")
    public String UpdateApplicationForm(ApplicationFormDTO applicationFormDTO) {
        System.out.println(applicationFormDTO);
        boolean isUpdate = formService.formUpdate(applicationFormDTO);
        if (isUpdate) {
            return "ProfileUpdateResponseSuccess";
        } else {
            return "ProfileUpdateResponseError";
        }
    }

    @GetMapping("deleteProfile/{email:}")
    public String getApplicationForDelete(@PathVariable String email) {
        boolean isDelete = formService.isDelete(email);
        if (isDelete) {
            return "DeleteProfile";
        }
        return "Error";
    }


}