package com.example.foodcycleai;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodQualityActivity extends AppCompatActivity {

    private TextView freshnessValue;
    private TextView qualityStatus;
    private TextView shelfLifeValue;
    private TextView recommendationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_food_quality);

        freshnessValue = findViewById(R.id.freshnessValue);
        qualityStatus = findViewById(R.id.qualityStatus);
        shelfLifeValue = findViewById(R.id.shelfLifeValue);
        recommendationText = findViewById(R.id.recommendationText);

        Button scanFoodButton = findViewById(R.id.scanFoodButton);

        scanFoodButton.setOnClickListener(v -> {

            // Simulated AI food quality analysis

            freshnessValue.setText("86%");

            qualityStatus.setText("Good ✓");

            shelfLifeValue.setText("3 days");

            recommendationText.setText(
                    "The food appears fresh and suitable for redistribution. " +
                            "Prioritize this item within the next 3 days to reduce " +
                            "food waste."
            );
        });
    }
}