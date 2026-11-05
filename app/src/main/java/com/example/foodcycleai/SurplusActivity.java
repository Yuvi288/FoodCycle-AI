package com.example.foodcycleai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SurplusActivity extends AppCompatActivity {

    private EditText foodNameInput;
    private EditText quantityInput;
    private EditText expiryInput;

    private TextView partnerName;
    private TextView partnerDetails;

    private Button confirmDonationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_surplus);

        foodNameInput = findViewById(R.id.foodNameInput);
        quantityInput = findViewById(R.id.quantityInput);
        expiryInput = findViewById(R.id.expiryInput);

        partnerName = findViewById(R.id.partnerName);
        partnerDetails = findViewById(R.id.partnerDetails);

        Button addSurplusButton =
                findViewById(R.id.addSurplusButton);

        confirmDonationButton =
                findViewById(R.id.confirmDonationButton);

        addSurplusButton.setOnClickListener(v -> {

            String foodName =
                    foodNameInput.getText().toString().trim();

            String quantity =
                    quantityInput.getText().toString().trim();

            String expiry =
                    expiryInput.getText().toString().trim();

            if (foodName.isEmpty()
                    || quantity.isEmpty()
                    || expiry.isEmpty()) {

                Toast.makeText(
                        SurplusActivity.this,
                        "Please enter all food details",
                        Toast.LENGTH_SHORT
                ).show();

                return;
            }

            // Simulated AI partner matching

            partnerName.setText(
                    "🤝 Community Food Bank"
            );

            partnerDetails.setText(
                    "Suitable partner found for "
                            + quantity
                            + " kg of "
                            + foodName
                            + ". Pickup can be arranged before "
                            + expiry
                            + "."
            );

            confirmDonationButton.setVisibility(
                    View.VISIBLE
            );
        });

        // Open Route Optimization

        confirmDonationButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    SurplusActivity.this,
                    RouteOptimizationActivity.class
            );

            startActivity(intent);
        });
    }
}