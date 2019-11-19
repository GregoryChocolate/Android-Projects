package com.example.lightheadapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class LightHeadApp extends AppCompatActivity {
    public void buttonOnClick() {

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int r = rand.nextInt();
                int g = rand.nextInt();
                int b = rand.nextInt();
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
                int color = ((ColorDrawable) bgElement.getBackground()).getColor();
                if (color == Color.WHITE) {
                    bgElement.setBackgroundColor(Color.BLUE);
                } else if (color == Color.BLUE){
                    bgElement.setBackgroundColor(Color.RED);
                } else {
                    bgElement.setBackgroundColor(Color.rgb(r,g,b));
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(Color.WHITE);
        buttonOnClick();
    }

}
