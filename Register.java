package com.example.schoollink;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class Register extends AppCompatActivity implements View.OnClickListener
{


    Button bRegister;
    EditText etName, etUsername, etPassword, etGradelevel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        bRegister = (Button) findViewById(R.id.bRegister);
        etName = (EditText) findViewById(R.id.etName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etGradelevel = (EditText)findViewById(R.id.etGradeLevel);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bRegister:

                String name = etName.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                int gradelevel = Integer.parseInt(etGradelevel.getText().toString());

                User registerData = new User(name, gradelevel, username, password );
                break;
        }
    }
}