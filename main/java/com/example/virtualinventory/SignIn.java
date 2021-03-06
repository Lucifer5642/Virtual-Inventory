package com.example.virtualinventory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.sign_in) {
            EditText uname = (EditText) findViewById(R.id.username);
            EditText pass = (EditText) findViewById(R.id.password);

            String unamestr = uname.getText().toString();
            String passstr = pass.getText().toString();
            if (!passstr.isEmpty())
            {
                Toast password = Toast.makeText(SignIn.this, "Incorrect password!", Toast.LENGTH_SHORT);
                password.show();
            }

        }
        if(v.getId() == R.id.sign_up)
        {
            Intent i = new Intent(SignIn.this,SignUp.class);
            startActivity(i);
        }
    }
}