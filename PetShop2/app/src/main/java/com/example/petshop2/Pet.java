package com.example.petshop2;

import java.util.Date;

public abstract class Pet {
    private String name; // class only access
    private Date birthdate;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(String name, Date birthdate) {
        this.birthdate = birthdate;
        this.name = name;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public abstract String speak();
}
