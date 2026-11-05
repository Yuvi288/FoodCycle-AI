package com.example.foodcycleai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NGOFoodActivity extends AppCompatActivity {

    private TextView foodStatus;
    private TextView requestStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ngofood);

        foodStatus = findViewById(R.id.foodStatus);
        requestStatus = findViewById(R.id.requestStatus);

        Button requestFoodButton =
                findViewById(R.id.requestFoodButton);

        Button pickupButton =
                findViewById(R.id.pickupButton);

        requestFoodButton.setOnClickListener(v -> {

            foodStatus.setText(
                    "Available: 42 kg cooked meals"
            );

            requestStatus.setText(
                    "Request submitted successfully. " +
                            "The nearest available food source has " +
                            "been identified."
            );
        });

        pickupButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    NGOFoodActivity.this,
                    RouteOptimizationActivity.class
            );

            startActivity(intent);
        });
    }
}