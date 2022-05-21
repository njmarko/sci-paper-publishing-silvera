/**
    THIS IS GENERATED CODE AND SHOULD NOT BE CHANGED MANUALLY!!!

    Generated by: silvera
    Date: 2022-05-21 11:29:00
*/

package com.silvera.UserService.domain.model;

import org.springframework.data.annotation.Id;
import javax.validation.constraints.*;
public class AuthRequest {

    
    @Id
    private String id;
    
    
    
    @NotBlank(message="Field 'username' cannot be empty!")
    private java.lang.String username;
    
    
    @NotBlank(message="Field 'password' cannot be empty!")
    private java.lang.String password;


    
    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }
    
    public java.lang.String getPassword() {
        return this.password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }
    

    
    public String getId(){
        return this.id;
    }
    
}