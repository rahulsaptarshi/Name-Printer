package com.drafters.printer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintController {

    @GetMapping("/getName")
    public String getName() {
        return "Rahul Here !!";
    }

}
