package com.example.petshop2;

import java.util.Date;

public class Scorpion extends com.example.petshop2.Pet { // extends - inherit from a class
    public Scorpion(String name) { // constructor
        super(name);
    }

    public Scorpion(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public String speak() {
        return "hiss";
    }
}
