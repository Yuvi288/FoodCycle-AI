package com.example.foodcycleai;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductionActivity extends AppCompatActivity {

    private TextView efficiencyValue;
    private TextView rawMaterialValue;
    private TextView downtimeValue;
    private TextView energyValue;
    private TextView recommendationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_production);

        efficiencyValue = findViewById(R.id.efficiencyValue);
        rawMaterialValue = findViewById(R.id.rawMaterialValue);
        downtimeValue = findViewById(R.id.downtimeValue);
        energyValue = findViewById(R.id.energyValue);
        recommendationText = findViewById(R.id.recommendationText);

        Button analyzeButton =
                findViewById(R.id.analyzeButton);

        analyzeButton.setOnClickListener(v -> {

            efficiencyValue.setText("87%");
            rawMaterialValue.setText("6.2%");
            downtimeValue.setText("42 min");
            energyValue.setText("12% excess");

            recommendationText.setText(
                    "AI recommends reducing production by 8% " +
                            "during low-demand periods and scheduling " +
                            "maintenance during the next available downtime. " +
                            "This can help reduce raw-material loss and " +
                            "excess energy consumption."
            );
        });
    }
}