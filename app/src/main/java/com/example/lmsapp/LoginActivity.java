package com.example.lmsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText inputUserName;
    private EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputUserName = findViewById(R.id.input_username);
        inputPassword = findViewById(R.id.input_password);
    }

    public void login(View view) {

        if (((inputUserName.getText().toString()).equals("admin")) && ((inputPassword.getText().toString()).equals("admin"))){
            Intent intent = new Intent(LoginActivity.this, BoardSelectionActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Incorrect username/password", Toast.LENGTH_SHORT).show();
        }
    }
}
