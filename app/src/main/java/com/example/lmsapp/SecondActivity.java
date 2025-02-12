package com.example.lmsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            // Navigate to SecondActivity
            Intent intent = new Intent(SecondActivity.this, thirdActivity.class);
            startActivity(intent);
        });
    }
}