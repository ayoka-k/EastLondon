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
                Intent towerOfLondonIntent = new Intent(TowerActivity.this, TowerOfLondonFragment.class);
                startActivity(towerOfLondonIntent);
            }
        });
    }
}
