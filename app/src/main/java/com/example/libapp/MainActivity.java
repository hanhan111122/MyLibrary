package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CardView clothingCard,eleccard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clothingCard = findViewById(R.id.librarian);
        clothingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Librarian Login");
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        eleccard = findViewById(R.id.student);
        eleccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Student Login");
                Intent intent = new Intent(MainActivity.this, StudentSignUp.class);
                startActivity(intent);
            }
        });

    }
    private void showToast(String message) {

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}