package com.example.lmsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoardSelectionActivity extends AppCompatActivity {

    Button rbse_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_selection);

        rbse_button = findViewById(R.id.rbse_button);
        rbse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BoardSelectionActivity.this, StandardActivity.class);
                startActivity(intent);
            }
        });
    }
}
