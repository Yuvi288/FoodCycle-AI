package com.example.foodcycleai;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ImpactActivity extends AppCompatActivity {

    private TextView impactInsight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_impact);

        impactInsight = findViewById(R.id.impactInsight);

        Button reportButton =
                findViewById(R.id.reportButton);

        reportButton.setOnClickListener(v -> {

            impactInsight.setText(
                    "AI analysis shows strong food recovery activity. " +
                            "Continue using demand prediction and surplus " +
                            "redistribution to reduce avoidable food waste. " +
                            "Your actions are also contributing to lower " +
                            "carbon emissions and better resource efficiency."
            );

            Toast.makeText(
                    ImpactActivity.this,
                    "Sustainability report generated",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}