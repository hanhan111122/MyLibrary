package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class faq extends AppCompatActivity {
            private RecyclerView recyclerView;
            private FAQAdapter faqAdapter;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_faq);

                // Initialize RecyclerView
                recyclerView = findViewById(R.id.recycler_view);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                recyclerView.setHasFixedSize(true);

                // Set up adapter for RecyclerView
                faqAdapter = new FAQAdapter(getFaqList());
                recyclerView.setAdapter(faqAdapter);
            }

            // Define FAQ items
            private List<FAQItem> getFaqList() {
                List<FAQItem> faqList = new ArrayList<>();

                faqList.add(new FAQItem("Question 1:aaaaaaaaaaa", "Answer 1"));
                faqList.add(new FAQItem("Question 2aaaaaaaaa", "Answer 2"));
                faqList.add(new FAQItem("Question 3aaaaaaaaa", "Answer 3"));
                faqList.add(new FAQItem("Question 4aaaaaaaaaa", "Answer 4"));
                faqList.add(new FAQItem("Question 5aaaaaaaaaa", "Answer 5"));

                return faqList;
            }
        }



