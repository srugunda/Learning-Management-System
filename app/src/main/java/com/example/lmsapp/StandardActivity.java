package com.example.lmsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StandardActivity extends AppCompatActivity {
    private Button standard_10_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        standard_10_button = findViewById(R.id.button_standard_10);

        standard_10_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
