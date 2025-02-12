package com.example.lmsapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class subjectsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        Button btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(subjectsActivity.this, thirdActivity.class);
            startActivity(intent);
            finish();  // Close the current activity
        });
    }
}
