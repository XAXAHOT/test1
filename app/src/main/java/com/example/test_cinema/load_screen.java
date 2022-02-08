package com.example.test_cinema;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.ConnectionService;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class load_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_screen);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(load_screen.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}