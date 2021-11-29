package com.github.tiwautk.SpringBootApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	protected User() {

	}
	
	public User(String name, Integer id, String occupation) {
		super();
        this.name = name;
        this.id = id;
        this.occupation = occupation;
    }

    private String name;
    
    @Id
    @GeneratedValue
    private int id;
    
    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
