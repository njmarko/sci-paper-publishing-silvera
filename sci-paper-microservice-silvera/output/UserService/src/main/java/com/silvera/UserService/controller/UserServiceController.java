/**
    THIS IS GENERATED CODE AND SHOULD NOT BE CHANGED MANUALLY!!!

    Generated by: silvera
    Date: 2022-05-21 11:29:00
*/

package com.silvera.UserService.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

import com.silvera.UserService.service.base.IUserServiceService;
import com.silvera.UserService.domain.model.*;



@RefreshScope
@RestController
public class UserServiceController {

    @Autowired
    IUserServiceService userServiceService;

    // Auto-generated CRUD methods
    



    
        
    

    @PostMapping(value = "authenticate")


    @ResponseBody
    public AuthResponse authenticate(@RequestBody AuthRequest authRequest) {
        
        return userServiceService.authenticate(authRequest);

    }
    
        
    

    @PostMapping(value = "register")


    @ResponseBody
    public java.lang.String register(@RequestBody User user) {
        
        return userServiceService.register(user);

    }
    
        
    

    @GetMapping(value="isloggedin/{jwt}")


    @ResponseBody
    public java.lang.Boolean isLoggedIn(@PathVariable java.lang.String jwt) {
        
        return userServiceService.isLoggedIn(jwt);

    }
    
        
    

    @GetMapping(value="getname/{jwt}")


    @ResponseBody
    public java.lang.String getName(@PathVariable java.lang.String jwt) {
        
        return userServiceService.getName(jwt);

    }
    

}