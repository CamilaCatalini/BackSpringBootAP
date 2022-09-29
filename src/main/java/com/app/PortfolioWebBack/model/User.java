/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.PortfolioWebBack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    
    private String name;
    private String surname;
    private String title;
    private String url_instagram;
    private String url_github;
    private String url_linkedin;

    public User() {
    }

    public User(Long id_user, String name, String surname, String title, String url_instagram, String url_github, String url_linkedin) {
        this.id_user = id_user;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.url_instagram = url_instagram;
        this.url_github = url_github;
        this.url_linkedin = url_linkedin;
    }

    
    
    

    
    
}
