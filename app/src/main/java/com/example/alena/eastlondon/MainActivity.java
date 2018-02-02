package com.example.alena.eastlondon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set OnClickListener on the Tower category text view
        View tower = findViewById(R.id.tower_container);
        tower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent towerIntent = new Intent(MainActivity.this, TowerActivity.class);
                startActivity(towerIntent);
            }
        });

        //Set OnClickListener on the Isle of Dogs category text view
        View theIsleOfDogs = findViewById(R.id.the_isle_of_dogs_container);
        theIsleOfDogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theIslOfDogsIntent = new Intent(MainActivity.this, TheIsleOfDogsActivity.class);
                startActivity(theIslOfDogsIntent);
            }
        });
    }
}
