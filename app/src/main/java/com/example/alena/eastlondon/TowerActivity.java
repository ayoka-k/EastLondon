package com.example.alena.eastlondon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tower);

        //Array to keep names of sights for Tower category
        final String [] towerSights = new String[3];
        towerSights[0] = "Tower of London";
        towerSights[1] = "Tower Bridge";
        towerSights[2] = "Wilton'\'s Music Hall";

        TextView towerOfLondon = findViewById(R.id.tower_of_london_text_view);
        towerOfLondon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}
