package net.sofware.backendcursojava.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import net.sofware.backendcursojava.models.request.UserDetailRequestModel;
import net.sofware.backendcursojava.models.responses.UserRest;
import net.sofware.backendcursojava.services.UserServiceInterface;
import net.sofware.backendcursojava.shared.dto.UserDTO;

@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserControllers {
    
    @Autowired
    UserServiceInterface userService;

    @GetMapping // consutar info
    public String getUser(){
        return "obtener usuarios";
    }

    @PostMapping
    public UserRest createUser (@RequestBody UserDetailRequestModel userDetails){

        UserRest userToReturn = new UserRest();

        UserDTO userDTO = new UserDTO();

        BeanUtils.copyProperties(userDetails, userDTO);

        UserDTO createdUSer = userService.createUser(userDTO);

        BeanUtils.copyProperties(createdUSer, userToReturn);

        return null;
    }

}

