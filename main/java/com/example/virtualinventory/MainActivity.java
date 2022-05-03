package com.example.virtualinventory;

import static com.example.virtualinventory.R.*;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.os.Handler;
import android.widget.EditText;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    Handler h = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        setContentView(layout.activity_homescreen);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Homescreen.class);
                startActivity(i);
                finish();

            }
        }, 1000);
    }

    public void onButtonClick(View v) {
        if(v.getId() == R.id.sign_in)
        {
            EditText a = (EditText)findViewById(id.username);
            String str = a.getText().toString();
            Intent i = new Intent(MainActivity.this,SignIn.class);
            startActivity(i);
        }
        if(v.getId() == R.id.sign_up)
        {
            Intent i = new Intent(MainActivity.this,SignUp.class);
            startActivity(i);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}