package com.example.virtualinventory;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
    }
    public void onSignUpClick(View v)
    {
        if(v.getId()== R.id.signupbutton)
        {
            EditText email = (EditText)findViewById(R.id.email);
            EditText uname = (EditText)findViewById(R.id.username);
            EditText pass = (EditText)findViewById(R.id.password);
            EditText cpass = (EditText)findViewById(R.id.cpassword);

            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String passstr = pass.getText().toString();
            String cpassstr = cpass.getText().toString();

            if(!passstr.equals(cpassstr))
            {
                Toast password = Toast.makeText(SignUp.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                password.show();
            }
        }

    }
}