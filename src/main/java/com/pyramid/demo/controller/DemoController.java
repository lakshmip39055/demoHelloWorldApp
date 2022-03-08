package com.pyramid.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/demo")
public class DemoController {

	@GetMapping(path="/helloWorld", produces = "application/json")
    public String isAvailable() 
    {
        return "helloWorld";
    }
}
