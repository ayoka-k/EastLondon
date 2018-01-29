package com.example.alena.eastlondon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set OnClickListener on the Tower category text view
        TextView tower = findViewById(R.id.tower_category);
        tower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent towerIntent = new Intent(MainActivity.this, TowerActivity.class);
                startActivity(towerIntent);
            }
        });

        //Set OnClickListener on the East End Riverside category text view
        TextView eastEndRiverside = findViewById(R.id.east_end_riverside_category);
        eastEndRiverside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eastEndRiversideIntent = new Intent(MainActivity.this, EastEndRiversideActivity.class);
                startActivity(eastEndRiversideIntent);
            }
        });

        //Set OnClickListener on the Isle of Dogs category text view
        TextView theIsleOfDogs = findViewById(R.id.the_isle_of_dogs_category);
        theIsleOfDogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theIslOfDogsIntent = new Intent(MainActivity.this, TheIsleOfDogsActivity.class);
                startActivity(theIslOfDogsIntent);
            }
        });

        //Set OnClickListener on the East End category text view
        TextView theEastEnd = findViewById(R.id.the_east_end_category);
        theEastEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theEastEndIntent = new Intent(MainActivity.this, TheEastEndActivity.class);
                startActivity(theEastEndIntent);
            }
        });
    }
}
