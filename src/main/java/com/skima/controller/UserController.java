package com.skima.controller;

import com.skima.DTO.UserResponseDTO;
import com.skima.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @GetMapping("/user")

    public UserResponseDTO getUser(){
        User user = new User(1,"Abimbola","youngskima@gmail;.com","Ikeja");
        return new UserResponseDTO(true,"User fetched successfully",user);
    }


}
