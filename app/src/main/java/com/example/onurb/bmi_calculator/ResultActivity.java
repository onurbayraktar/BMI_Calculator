package com.example.onurb.bmi_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    private EditText bmi_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Getting current intent and parameter //
        Intent current_intent = this.getIntent();
        Double bmi = current_intent.getDoubleExtra("BMI_Score", 0.0);

        System.out.println("YOUR BMI IS: " + bmi);
        // Assign the score to the text //
        bmi_score = (EditText)findViewById(R.id.score_box);
        bmi_score.setText(bmi.toString());
    }
}
