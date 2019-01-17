package com.example.hsdhillon13.randomcolours;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RandomColoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_colours_layout);

    }


    public void buttonClicked(View v) {
        int red = (int) (256 * Math.random());
        int green = (int) (256 * Math.random());
        int blue = (int) (256 * Math.random());

        double redvalue = (red/255.0)*100;
        double greenvalue = (green/255.0)*100;
        double bluevalue = (blue/255.0)*100;
        String redvaluestring = String.format("%.0f", redvalue);
        String greenvaluestring = String.format("%.0f", greenvalue);
        String bluevaluestring = String.format("%.0f", bluevalue);


        int newC = Color.rgb(red, green, blue);


        Button buttonF = (Button) findViewById(R.id.button1);
        buttonF.setBackgroundColor(newC);

        ((TextView) findViewById(R.id.relativeValues)).setText("R="+redvaluestring+"%, G="+greenvaluestring+"%, B="+bluevaluestring+"%");

    }
}