package com.prod.LBU.controllers;

import com.prod.LBU.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
