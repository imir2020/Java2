package ru.karpov.pro.bootspringcrud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerNum1 {

    @RequestMapping ("/showFirst")
    public String show() {
        return "Hello World"+"first SpringBoot Application!";
    }
}
