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
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_project;
    
    private String title;
    private String url;
    private String description;
    private String img_url;

    public Project() {
    }

    public Project(Long id_project, String title, String url, String description, String img_url) {
        this.id_project = id_project;
        this.title = title;
        this.url = url;
        this.description = description;
        this.img_url = img_url;
    }
    
}
