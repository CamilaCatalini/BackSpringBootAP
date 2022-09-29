/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.PortfolioWebBack.controller;

import com.app.PortfolioWebBack.model.Project;
import com.app.PortfolioWebBack.model.User;
import com.app.PortfolioWebBack.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IUserService uService;
    
    @PostMapping("v1/create/user")
    public void createUser(@RequestBody User u){
        uService.createUser(u);
    }
    
    @PostMapping("v1/create/project")
    public void createProject(@RequestBody Project p){
        uService.createProject(p);
    }
    
    @GetMapping("v1/show/project")
    @ResponseBody
    public List<Project> showProject(){
        return uService.showProject();
    }
    
    @GetMapping("v1/show/user")
    @ResponseBody
    public List<User> showUsers(){
        return uService.showUser();
    }
    
    
    @DeleteMapping("v1/delete-project/{id}")
    public void deleteProject(@PathVariable Long id){
        uService.deleteProject(id);
    }
    
    @PostMapping("v1/edit/user")
    public void editUser(@RequestBody User u){
        uService.editUser(u);
    }
}
