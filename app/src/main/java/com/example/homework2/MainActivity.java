package com.example.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.SplashActivity);


        Toast t = Toast.makeText(MainActivity.this , "Welcome to My ToDo application!" , Toast.LENGTH_SHORT );

        t.show();


    }
}
