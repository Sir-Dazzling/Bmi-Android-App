package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateNowClicked(View view)
    {
        //Redirecting user to Second Activity
        Intent intent = new Intent(this,ActivityTwo.class);
        startActivity(intent);
    }
}
