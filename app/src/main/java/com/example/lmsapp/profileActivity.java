package com.example.lmsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        Button btnlogout2 = findViewById(R.id.btnlogout2);
        btnlogout2.setOnClickListener(v -> {
            Intent intent = new Intent(profileActivity.this, SecondActivity.class);
            startActivity(intent);
            finish();
        });

    }
}