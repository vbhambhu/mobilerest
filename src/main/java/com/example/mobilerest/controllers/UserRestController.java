package com.example.mobilerest.controllers;

import com.example.mobilerest.entities.User;
import com.example.mobilerest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user", produces="application/json")
public class UserRestController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User loginUser(@RequestParam("username") String username,
                          @RequestParam("password") String password){

        return userService.login(username, password);
    }

}
