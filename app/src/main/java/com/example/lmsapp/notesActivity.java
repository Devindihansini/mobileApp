package com.example.lmsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class notesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        Button btnback = findViewById(R.id.main);
        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(notesActivity.this, thirdActivity.class);
            startActivity(intent);
            finish();  // Close the current activity
        });
    }
}
