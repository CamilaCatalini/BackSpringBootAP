/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.PortfolioWebBack.service;

import com.app.PortfolioWebBack.model.Project;
import com.app.PortfolioWebBack.model.User;
import java.util.List;


public interface IUserService {
    
    public List<User> showUser();
    
    public List<Project> showProject();
    
    public void createUser(User u); 
    
    public void deleteUser(Long id);
    
    public void deleteProject(Long id);
    
    public void editUser (User u);
    
    public void editProject (Project p);

    
    public void createProject(Project p); 
}
