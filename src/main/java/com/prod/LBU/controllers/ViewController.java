package com.prod.LBU.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
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
    @GetMapping("/complete-profile")
    public String showCompleteProfileForm(OAuth2AuthenticationToken token, Model model) {
        if (token != null) {
            model.addAttribute("name", token.getPrincipal().getAttribute("name"));
            model.addAttribute("email", token.getPrincipal().getAttribute("email"));
        }
        return "complete-profile";
    }



    //TODO averigua cómo despues de hacer un register podemos conectar un boton el front con la logica de salvar archivos: update tenemos que poder hacer el register. Prueba en postman a ver que pasa.

    //TODO deja de utilizar H2 vuelve a descargar postgres y crea una base de datos seria.
}
