package com.prod.LBU.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/google")
    public Map<String, Object> getGoogleUser(@AuthenticationPrincipal OidcUser oidcUser) {
        return oidcUser.getClaims();
    }

    @GetMapping("/github")
    public Map<String, Object> getGitHubUser(@AuthenticationPrincipal OAuth2User oAuth2User) {
        System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        return oAuth2User.getAttributes();
    }
    @RequestMapping
    public Principal user(Principal user){
        return user;
    }
}
