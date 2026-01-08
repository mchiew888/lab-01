package com.example.petshop2;

import java.util.Date;

public class Cat extends Pet implements Pettable{
    public Cat(String name) { // constructor
        super(name);
    }

    public Cat(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {

    }
}
