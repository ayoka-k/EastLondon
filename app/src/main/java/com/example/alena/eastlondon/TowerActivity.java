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

        TextView towerOfLondon = findViewById(R.id.tower_of_london_text_view);
        towerOfLondon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent towerOfLondonIntent = new Intent(TowerActivity.this, SightActivity.class);
                startActivity(towerOfLondonIntent);
            }
        });

        TextView towerBridge = findViewById(R.id.tower_bridge_text_view);
        towerBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent towerBridgeIntent = new Intent(TowerActivity.this, SightActivity.class);
                startActivity(towerBridgeIntent);
            }
        });

        TextView wiltonsMusicHall = findViewById(R.id.wiltions_music_hall_text_view);
        wiltonsMusicHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wiltonsMusicHallIntent = new Intent(TowerActivity.this, SightActivity.class);
                startActivity(wiltonsMusicHallIntent);
            }
        });
    }
}
