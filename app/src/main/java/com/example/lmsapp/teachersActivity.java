package com.example.lmsapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class teachersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

        Button btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(teachersActivity.this, thirdActivity.class);
            startActivity(intent);
            finish();  // Close the current activity
        });
    }
}
