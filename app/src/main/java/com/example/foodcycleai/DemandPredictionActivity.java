package com.example.foodcycleai;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DemandPredictionActivity extends AppCompatActivity {

    private TextView demandValue;
    private TextView recommendationText;
    private TextView riskText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_demand_prediction);

        demandValue = findViewById(R.id.demandValue);
        recommendationText = findViewById(R.id.recommendationText);
        riskText = findViewById(R.id.riskText);

        Button updatePredictionButton =
                findViewById(R.id.updatePredictionButton);

        updatePredictionButton.setOnClickListener(v -> {

            // Simulated AI prediction
            demandValue.setText("276 meals");

            recommendationText.setText(
                    "Demand is expected to increase by 25%. " +
                            "Prepare approximately 276 meals to reduce " +
                            "the risk of food shortage and overproduction."
            );

            riskText.setText("⚠️ Surplus Risk: Medium");
        });
    }
}