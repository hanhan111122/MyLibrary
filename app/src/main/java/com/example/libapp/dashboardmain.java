package com.example.libapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
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

public class dashboardmain extends AppCompatActivity {

    CardView adminCard,adminReturn;
    Button logoutButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_main);


        adminCard = findViewById(R.id.adminCard);
        adminCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Admin System Clicked");
                Intent intent = new Intent(dashboardmain.this, uploadbookpage.class);
                startActivity(intent);
            }
        });

        adminReturn = findViewById(R.id.adminreturnCard);
        adminReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Fine System Clicked");
                Intent intent = new Intent(dashboardmain.this, AdminLateReturn.class);
                startActivity(intent);
            }
        });

        logoutButton = findViewById(R.id.logoutLayout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Logout");
                Intent intent = new Intent(dashboardmain.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void showToast(String message) {

        Toast.makeText(dashboardmain.this, message, Toast.LENGTH_SHORT).show();
    }
}