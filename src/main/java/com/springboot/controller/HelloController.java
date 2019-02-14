package com.springboot.controller;

import com.springboot.model.City;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private CityService service;

    @RequestMapping("find")
    public String findAll(ModelMap model){

        List<City> all = service.findAll();
        model.addAttribute("all",all);
        System.err.println(all);
        return "hello";
    }

    @RequestMapping("hello1")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}