package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void calculateBMI(View view)
    {
        //Declaring variables
        double weight,height,bmi;
        String msg;

        //Getting References to Widgets
        EditText wi = (EditText) findViewById(R.id.weightInput);
        EditText hi = (EditText) findViewById(R.id.heightInput);

        Button calculate = (Button) findViewById(R.id.calculate);

        TextView bmiOutput = (TextView) findViewById(R.id.bmiOutput);
        TextView result = (TextView) findViewById(R.id.result);

        //Storing values into variables
        weight = Double.parseDouble(wi.getText().toString());
        height = Double.parseDouble(hi.getText().toString());

        /*Calculating BMI*/
        bmi = weight / (height * height);

        /*Output results*/
        bmiOutput.setText(String.valueOf(bmi));

        if (bmi<18.5)
        {
            msg = "You are Underweight";
        }
        else if(bmi>=18.5 && bmi<25)
        {
            msg = "Normal";
        }
        else if (bmi>25)
        {
            msg = "You are Overweight";
        }
        else
            {
                msg = "Invalid Input";
            }

        result.setText(msg);
    }
}
