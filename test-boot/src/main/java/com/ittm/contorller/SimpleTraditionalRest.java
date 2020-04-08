package com.ittm.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SimpleTraditionalRest {
    @GetMapping(value = "/test1")
    public String testMVC(){
        return "hello worled spring boot";
    }
}
