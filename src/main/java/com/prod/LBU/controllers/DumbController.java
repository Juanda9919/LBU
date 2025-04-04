package com.prod.LBU.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DumbController {

    @GetMapping("/get")
    public String getPublic() {
        return "Hola Todo bien ";
    }

    @GetMapping("/getSecure")
    public String getSecured() {

        return "Hola Todo bien Secured";
    }
}
