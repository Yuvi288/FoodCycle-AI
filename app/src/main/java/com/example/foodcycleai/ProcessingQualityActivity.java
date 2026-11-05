package com.example.foodcycleai;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProcessingQualityActivity extends AppCompatActivity {

    private TextView qualityScore;
    private TextView qualityStatus;
    private TextView defectValue;
    private TextView recommendationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_processing_quality);

        qualityScore = findViewById(R.id.qualityScore);
        qualityStatus = findViewById(R.id.qualityStatus);
        defectValue = findViewById(R.id.defectValue);
        recommendationText =
                findViewById(R.id.recommendationText);

        Button analyzeButton =
                findViewById(R.id.analyzeButton);

        analyzeButton.setOnClickListener(v -> {

            qualityScore.setText("91%");
            qualityStatus.setText("Good ✓");
            defectValue.setText("2.4%");

            recommendationText.setText(
                    "AI analysis indicates that the batch " +
                            "meets the expected quality level. " +
                            "Continue monitoring visual defects and " +
                            "storage conditions to prevent quality loss."
            );
        });
    }
}