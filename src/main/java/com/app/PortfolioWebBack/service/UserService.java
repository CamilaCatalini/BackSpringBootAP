                               /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.PortfolioWebBack.service;

import com.app.PortfolioWebBack.model.Project;
import com.app.PortfolioWebBack.model.User;
import com.app.PortfolioWebBack.repository.ProjectRepository;
import com.app.PortfolioWebBack.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService  {
    
    @Autowired
    UserRepository uRepo;
    
    @Autowired
    ProjectRepository pRepo;

    @Override
    public List<User> showUser() {
        return uRepo.findAll();
    }
    
    @Override
    public List<Project> showProject() {
        return pRepo.findAll();
    }

    @Override
    public void createUser(User u) {
        uRepo.save(u);
    }
    
    @Override
    public void createProject(Project p) {
        pRepo.save(p);
        
    }

    @Override
    public void deleteUser(Long id) {
        uRepo.deleteById(id);
        
    }
    
    @Override
    public void deleteProject(Long id) {
        pRepo.deleteById(id);
        
    }

    @Override
    public void editUser(User u) {
        uRepo.save(u);
    }
    
    @Override
    public void editProject(Project p) {
        pRepo.save(p);
    }    
    
}