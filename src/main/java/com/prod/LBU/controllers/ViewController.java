package com.prod.LBU.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/profile")
    public String profile(OAuth2AuthenticationToken oAuth2AuthenticationToken, Model model){
        model.addAttribute("name", oAuth2AuthenticationToken.getPrincipal().getAttribute("name"));
        model.addAttribute("email", oAuth2AuthenticationToken.getPrincipal().getAttribute("email"));
        model.addAttribute("picture", oAuth2AuthenticationToken.getPrincipal().getAttribute("picture"));
        return "user-profile";
    }

    //TODO tienes que crear otro view con un template que permita a la persona que se está registrando llenar el resto de sus datos
    //TODO averigua cómo despues de hacer un register podemos conectar un boton el front con la logica de salvar archivos
    //TODO deja de utilizar H2 vuelve a descargar postgres y crea una base de datos seria.
}
