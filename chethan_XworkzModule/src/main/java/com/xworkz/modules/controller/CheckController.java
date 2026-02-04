package com.xworkz.modules.controller;

import com.xworkz.modules.dto.SignupDTO;
import com.xworkz.modules.service.ModuleService;
import com.xworkz.modules.service.check.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/")
public class CheckController {

    @Autowired
    CheckService checkService;
    @Autowired
    ModuleService moduleService;



    @GetMapping("checkPhoneNumber")
    @ResponseBody
    public String checkPhoneNumber(@RequestParam String phone){
        SignupDTO signupDTO = checkService.checkPhoneNumber(phone);
        if(signupDTO!=null){
            return "Phone Number is Already Exist";
        }else return "Phone Number is Valid";
    }

//    @GetMapping("checkPhoneNumber")
//    @ResponseBody
//    public String checkEmail(@RequestParam String email){
//        SignupDTO signupDTO = moduleService.checkEmail(email);
//        if(signupDTO!=null){
//            return "Phone Number is Already Exist";
//        }else return "Phone Number is Valid";
//    }

}
