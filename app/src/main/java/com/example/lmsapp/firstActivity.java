package com.example.lmsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class firstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btnget = findViewById(R.id.btnget);
        btnget.setOnClickListener(v -> {
            // Navigate to SecondActivity
            Intent intent = new Intent(firstActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
