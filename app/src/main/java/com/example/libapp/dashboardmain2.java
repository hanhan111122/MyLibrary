package com.example.libapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class dashboardmain2 extends AppCompatActivity {

    CardView bookCard,fineCard, newsCard, faqCard;
    Button logoutButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboardmain2);


        bookCard = findViewById(R.id.bookCard);
        bookCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Boook System Clicked");
                Intent intent = new Intent(dashboardmain2.this, BookActivityPage.class);
                startActivity(intent);
            }
        });

        fineCard = findViewById(R.id.fineCard);
        fineCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Student Fine Clicked");
                Intent intent = new Intent(dashboardmain2.this, StudentFinePage.class);
                startActivity(intent);
            }
        });

        newsCard = findViewById(R.id.newsCard);
        newsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("News Clicked");
                Intent intent = new Intent(dashboardmain2.this, newsActivity.class);
                startActivity(intent);
            }
        });

        faqCard = findViewById(R.id.faqCard);
        faqCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Faq Clicked");
                Intent intent = new Intent(dashboardmain2.this, faq.class);
                startActivity(intent);
            }
        });

        logoutButton = findViewById(R.id.logoutLayout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Logout");
                Intent intent = new Intent(dashboardmain2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void showToast(String message) {

        Toast.makeText(dashboardmain2.this, message, Toast.LENGTH_SHORT).show();
    }
}