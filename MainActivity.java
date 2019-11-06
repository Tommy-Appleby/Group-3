package com.example.schoollink;

import android.content.Intent;
import android.os.Bundle;
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bLogout;
    EditText etName, etUsername, etGradeLevel;
    UserLocalStore userLocalStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        bLogout = (Button) findViewById(R.id.bLogout);
        etGradeLevel = (EditText) findViewById(R.id.etPassword);
        bLogout.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);
    }

    @Override
    protected  void onStart()
    {
        super.onStart();

        if(authenticate()==true)
        {
            displayUserDetails();
        }

    }

    private boolean authenticate()
    {return userLocalStore.getUserLoggedIn();
    }
    private void displayUserDetails()
    {
        User user = userLocalStore.getLoggedInUser();
        etUsername.setText(user.username);
        etName.setText(user.name);
        etGradeLevel.setText(user.gradeLevel + "");
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.bLogout:

                userLocalStore.clearUserData();;
                userLocalStore.setUserLoggedIn(false);


                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
