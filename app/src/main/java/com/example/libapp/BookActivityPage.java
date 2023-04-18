package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BookActivityPage extends AppCompatActivity {

    CardView borrowbook,returnbook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);


        borrowbook = findViewById(R.id.borrowbook);
        borrowbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Borrow Book");
                Intent intent = new Intent(BookActivityPage.this, StudentBorrowBookPage.class);
                startActivity(intent);
            }
        });

        returnbook = findViewById(R.id.returnbook);
        returnbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Return Book");
                Intent intent = new Intent(BookActivityPage.this, StudentReturn2.class);
                startActivity(intent);
            }
        });

    }
    private void showToast(String message) {

        Toast.makeText(BookActivityPage.this, message, Toast.LENGTH_SHORT).show();
    }
}