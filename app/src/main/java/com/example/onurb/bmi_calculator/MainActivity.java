package com.example.onurb.bmi_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Our variables, we need two edit text for inputs, one button //
    private EditText Weight, Height;
    private Button Calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning our variables //
        Weight = (EditText)findViewById(R.id.weight_box);
        Height = (EditText)findViewById(R.id.height_box);
        Calculate = (Button)findViewById(R.id.calculate_button);

        // Our button's listener function //
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // We'll call calculateBMI function in a click event
                calculateBMI(Double.parseDouble(Weight.getText().toString()), Double.parseDouble(Height.getText().toString()));
            }
        });
    }

    // BMI Calculation function //
    private void calculateBMI(double weight, double height){
        double bmi;
        bmi = weight / (height * height);
        // Since we need to show the results in a new activity, we'll create an intent //
        Intent resultIntent = new Intent(this, ResultActivity.class);
        resultIntent.putExtra("BMI_Score", bmi);
        startActivity(resultIntent);
    }
}
