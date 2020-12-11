package com.naorandd.tileslipgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tile_1 = findViewById(R.id.tile_1);
        Button tile_2 = findViewById(R.id.tile_2);
        Button tile_3 = findViewById(R.id.tile_3);
        Button tile_4 = findViewById(R.id.tile_4);
        Button tile_5 = findViewById(R.id.tile_5);
        Button tile_6 = findViewById(R.id.tile_6);
        Button tile_7 = findViewById(R.id.tile_7);
        Button tile_8 = findViewById(R.id.tile_8);
        Button tile_9 = findViewById(R.id.tile_9);

        tile_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (tile_1.getVisibility() != View.VISIBLE) {
                    tile_1.setVisibility(View.VISIBLE);
                } else {
                    tile_1.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}