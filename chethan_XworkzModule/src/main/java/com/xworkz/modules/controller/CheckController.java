package com.xworkz.modules.controller;

import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.dto.AddTeamMemberDTO;
import com.xworkz.modules.dto.SignupDTO;
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

    @GetMapping("checkPhoneNumber")
    @ResponseBody
    public String checkPhoneNumber(@RequestParam String phone){
        SignupDTO signupDTO = checkService.checkPhoneNumber(phone);
        if(signupDTO!=null){
            return "Phone Number is Already Exist";
        }else return "Phone Number is Valid";
    }

    @GetMapping("checkEmail")
    @ResponseBody
    public String checkEmail(@RequestParam String email){
        boolean isAvaliable = checkService.checkEmail(email);
        if(isAvaliable){
            return "Email is Already Exist";
        }else return "Email is Valid";
    }

    @GetMapping("checkEmailLogin")
    @ResponseBody
    public String checkEmailLogin(@RequestParam String email){
        boolean isAvaliable = checkService.checkEmail(email);
        if(isAvaliable){
            return "Email is Valid";
        }else return "Email is Not Registered ,   Do SignUp";
    }



    @GetMapping("checkTeamHeadPhNo")
    @ResponseBody
    public String checkTeamHeadPhoneNumber(@RequestParam String phone){
       AddTeamDTO addTeamDTO = checkService.checkTeamHeadPhoneNo(phone);
        if(addTeamDTO!=null){
            return "Phone Number is Already Exist";
        }else return "Phone Number is Valid";
    }

    @GetMapping("checkTeamHeadEmail")
    @ResponseBody
    public String checkTeamEmail(@RequestParam String email){
        boolean isAvaliable = checkService.checkTeamEmail(email);
        if(isAvaliable){
            return "Email is Already Exist";
        }else return "Email is Valid";
    }




    @GetMapping("checkPhoneNumberTeamMember")
    @ResponseBody
    public String checkTeamMemberPhoneNumber(@RequestParam String phone){
        AddTeamMemberDTO addTeamDTO = checkService.checkTeamMemberPhoneNo(phone);
        if(addTeamDTO!=null){
            return "Phone Number is Already Exist";
        }else return "Phone Number is Valid";
    }

    @GetMapping("checkEmailTeamMember")
    @ResponseBody
    public String checkTeamMemberEmail(@RequestParam String email){
        boolean isAvaliable = checkService.checkTeamMemberEmail(email);
        if(isAvaliable){
            return "Email is Already Exist";
        }else return "Email is Valid";
    }
}
