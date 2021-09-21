package net.sofware.backendcursojava.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import net.sofware.backendcursojava.models.request.UserDetailRequestModel;
import net.sofware.backendcursojava.models.responses.UserRest;

@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserControllers {
    
    @GetMapping // consutar info
    public String getUser(){
        return "obtener usuarios";
    }

    @PostMapping
    public UserRest createUser (@RequestBody UserDetailRequestModel userDetails){
        return null;
    }

}

