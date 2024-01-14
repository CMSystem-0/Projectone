package com.manageclgsys.springboot.mcsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
            @GetMapping("/hello")
        public String runner(Model themModel){
            themModel.addAttribute("theDate",new java.util.Date());
            return "/helloworld";
        }
    }

