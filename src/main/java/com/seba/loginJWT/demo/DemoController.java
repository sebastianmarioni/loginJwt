package com.seba.loginJWT.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Aca iría la API
@RestController
@RequestMapping("/api/vi")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping("/demo")
    public String welcome(){
        return "Welcome from secure endpoint";
    }
}
