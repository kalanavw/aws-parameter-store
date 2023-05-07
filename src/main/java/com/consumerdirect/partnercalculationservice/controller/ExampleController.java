package com.consumerdirect.partnercalculationservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ExampleController {

    @Value("${db.url}")
    private String dbUrlValue;

    @GetMapping("message")
    public String getMessage(){
        return "Get controller accessed I'm going to tell you value of the url: "+dbUrlValue;
    }

    @PostMapping("/message")
    public String enviarMensaje(@RequestParam("message") String message) {
        return "Message received: " + message;
    }
}
