/**
    THIS IS GENERATED CODE AND SHOULD NOT BE CHANGED MANUALLY!!!

    Generated by: silvera
    Date: 2022-05-19 13:06:03
*/

package com.silvera.User.controller;

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

import com.silvera.User.service.base.IUserService;
import com.silvera.User.domain.model.*;



@RefreshScope
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    // Auto-generated CRUD methods
    
    
    
    @RequestMapping(value="/user", method=RequestMethod.POST)
    @ResponseBody
    public User createUser(@Valid @RequestBody User user){
        return userService.createUser(user);
    }
    
    
    @RequestMapping(value="/user/{id}", method=RequestMethod.PUT)
    @ResponseBody
    public User updateUser(@PathVariable java.lang.String id, @Valid @RequestBody User user){
        return userService.updateUser(id, user);
    }
    
    
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)
    @ResponseBody
    public User readUser(@PathVariable java.lang.String id){
        return userService.readUser(id);
    }
    
    
    @RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable java.lang.String id){
        userService.deleteUser(id);
    }
    
    



    
        
    

    @PostMapping(value = "login")


    @ResponseBody
    public java.lang.String logIn(@RequestBody LoginInfo loginInfo) {
        
        return userService.logIn(loginInfo);

    }
    
    
    
    @GetMapping(value = "logout/{username}")


    @ResponseBody
    public java.lang.String logOut(@PathVariable java.lang.String username) {
        
        return userService.logOut(username);

    }
    
        
    

    @GetMapping(value="isloggedin/{username}")


    @ResponseBody
    public java.lang.Boolean isLoggedIn(@PathVariable java.lang.String username) {
        
        return userService.isLoggedIn(username);

    }
    
        
    

    @GetMapping(value="getname/{username}")


    @ResponseBody
    public java.lang.String getName(@PathVariable java.lang.String username) {
        
        return userService.getName(username);

    }
    

}