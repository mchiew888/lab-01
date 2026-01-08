package com.example.petshop2;

import java.util.Date;

public abstract class Mood {
    private Date date;

    public Mood() { // constructor that sets date to default
        this.date = new Date();
    }

    public Mood(Date date) { // constructor with argument
        this.date = date;
    }

    // getter and setter
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String status();
}
