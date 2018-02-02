package com.example.alena.eastlondon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TheIsleOfDogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_isle_of_dogs);

        TextView canaryWharf = findViewById(R.id.canary_wharf_text_view);
        canaryWharf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent canaryWharfIntent = new Intent(TheIsleOfDogsActivity.this, SightActivity.class);
                startActivity(canaryWharfIntent);
            }
        });

        TextView islandGardens = findViewById(R.id.island_gardens_text_view);
        islandGardens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent islandGardensIntent = new Intent(TheIsleOfDogsActivity.this, SightActivity.class);
                startActivity(islandGardensIntent);
            }
        });

        TextView trinityBuoyWharf = findViewById(R.id.trinity_buoy_wharf_text_view);
        trinityBuoyWharf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trinityBuoyWharfIntent = new Intent(TheIsleOfDogsActivity.this, SightActivity.class);
                startActivity(trinityBuoyWharfIntent);
            }
        });
    }
}
