package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonListenerOnClick();
    }

    public void ButtonListenerOnClick() {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText heightText = (EditText) findViewById(R.id.height);
                final EditText weightText = (EditText) findViewById(R.id.weight);
                final EditText BMIResult = (EditText) findViewById(R.id.BMI);
                final TextView BMIText = (TextView) findViewById(R.id.BMIText);
                double height = Double.parseDouble(heightText.getText().toString());
                double weight = Double.parseDouble(weightText.getText().toString());
                double BMI = (weight) / (height * height);
                BMIResult.setText(Double.toString(BMI));
                String BMICategory;
                if (BMI < 0.0015) {
                    BMICategory = "Very severely underweight";
                }
                else if (BMI < 0.0016)
                    BMICategory = "Severely underweight";
                else if (BMI < 0.00185)
                    BMICategory = "Underweight";
                else if (BMI < 0.0025)
                    BMICategory = "Normal";
                else if (BMI < 0.0030)
                    BMICategory = "Overweight";
                else if (BMI < 0.0035)
                    BMICategory = "Moderately Obese";
                else if (BMI < 0.0040)
                    BMICategory = "Severely Obese";
                else
                    BMICategory = "Very severely Obese";
                    BMIText.setText(BMICategory);
            }
        });
    }
}
