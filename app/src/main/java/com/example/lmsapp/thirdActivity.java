package com.example.lmsapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class thirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnthird = findViewById(R.id.btnthird);
        btnthird.setOnClickListener(v -> {
            Intent intent = new Intent(thirdActivity.this, SecondActivity.class);
            startActivity(intent);
            finish();  // Close the current activity
        });

        Button btnQuiz = findViewById(R.id.btnquiz);
        btnQuiz.setOnClickListener(v -> {
            Intent intent = new Intent(thirdActivity.this, quizActivity.class);
            startActivity(intent);
        });

        Button btnSubject = findViewById(R.id.btnsubject);
        btnSubject.setOnClickListener(v -> {
            Intent intent = new Intent(thirdActivity.this, subjectsActivity.class);
            startActivity(intent);
        });

        Button btnTeacher = findViewById(R.id.btnteacher);
        btnTeacher.setOnClickListener(v -> {
            Intent intent = new Intent(thirdActivity.this, teachersActivity.class);
            startActivity(intent);
        });

        Button btnuser = findViewById(R.id.btnuser);
        btnuser.setOnClickListener(v -> {
            Intent intent = new Intent(thirdActivity.this, profileActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
