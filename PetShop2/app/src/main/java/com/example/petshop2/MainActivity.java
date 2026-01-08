package com.example.petshop2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.petshop2.Pettable;
import com.example.petshop2.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


//        Pet pet = new Pet(""); not allowed bc parent is abstract
        com.example.petshop2.Cat cat = new com.example.petshop2.Cat("Lucy"); // subclass of parent so this is allowed
        com.example.petshop2.Dog dog = new com.example.petshop2.Dog("Snoopy");
        ArrayList<com.example.petshop2.Pet> petList = new ArrayList<com.example.petshop2.Pet>();
        // Can store both Cat and Dog objects
        // since they both inherit from Pet
        petList.add(cat);
        petList.add(dog);

        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
        pettablePets.add(cat);
        pettablePets.add(dog);
        // pettablePets.add(scorpion); This should produce an error
    }
}