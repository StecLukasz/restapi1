package pl.mojaapka.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.mojaapka.restapi.config.LoginCredentials;

@RestController
public class LoginControler {

    @PostMapping("/login")
    public void login(@RequestBody LoginCredentials credentials) {

    }

}
