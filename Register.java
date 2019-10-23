package com.example.schoolapp;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Register extends AppCompatActivity implements View.OnClickListener
{
    Button bRegister;
    EditText etName, etUsername, etPassword;
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
        bRegister.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.bRegister:
                break;
        }
    }
}
