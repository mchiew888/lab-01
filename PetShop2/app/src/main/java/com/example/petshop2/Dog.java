package com.example.petshop2;

import java.util.Date;

public class Dog extends com.example.petshop2.Pet implements Pettable {
    public Dog(String name) { // constructor
        super(name);
    }

    public Dog(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public Void pet() {
        return null;
    }
}
}

