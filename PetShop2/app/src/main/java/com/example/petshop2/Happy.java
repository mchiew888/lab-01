package com.example.petshop2;

import java.util.Date;

public class Happy extends Mood {
    public Happy() { // constructor that sets date to default
        super(new Date());
    }

    public Happy(Date date) { // constructor with argument
        super(date);
    }

    @Override
    public String status() {
        return "Happy";
    }

}
