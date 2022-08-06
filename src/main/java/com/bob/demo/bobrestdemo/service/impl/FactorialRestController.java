package com.bob.demo.bobrestdemo.service.impl;


import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bob.demo.bobrestdemo.service.Factorial;

@RestController
@RequestMapping()
public class FactorialRestController {
    @Autowired
    private Factorial factService;

    public FactorialRestController(Factorial factService) {
        this.factService = factService;
    }



    
    @GetMapping("/api/v1/calculatefactorial")
    @ResponseBody
    public BigInteger createPost(@RequestParam(name = "id") int i){
        return factService.calculateFactorial(i);
    
    }
}
