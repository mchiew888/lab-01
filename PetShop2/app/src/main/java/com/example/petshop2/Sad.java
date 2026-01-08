package com.example.petshop2;

import java.util.Date;

public class Sad extends Mood {
    public Sad() { // constructor that sets date to default
        super(new Date());
    }
    public Sad(Date date) { // constructor
        super(date);
    }

    @Override
    public String status() {
        return "Sad";
    }
}
