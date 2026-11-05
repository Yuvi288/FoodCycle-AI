package com.example.foodcycleai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LoginActivity extends AppCompatActivity {

    private CardView kitchenCard;
    private CardView processingCard;
    private CardView ngoCard;
    private Button continueButton;

    private String selectedRole = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        // Find views
        kitchenCard = findViewById(R.id.kitchenCard);
        processingCard = findViewById(R.id.processingCard);
        ngoCard = findViewById(R.id.ngoCard);
        continueButton = findViewById(R.id.continueButton);

        // Institutional Kitchen
        kitchenCard.setOnClickListener(v -> {

            selectedRole = "Institutional Kitchen";

            Toast.makeText(
                    LoginActivity.this,
                    "Institutional Kitchen selected",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // Food Processing Unit
        processingCard.setOnClickListener(v -> {

            selectedRole = "Food Processing Unit";

            Toast.makeText(
                    LoginActivity.this,
                    "Food Processing Unit selected",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // NGO / Food Bank
        ngoCard.setOnClickListener(v -> {

            selectedRole = "NGO / Food Bank";

            Toast.makeText(
                    LoginActivity.this,
                    "NGO / Food Bank selected",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // Continue
        continueButton.setOnClickListener(v -> {

            if (selectedRole.isEmpty()) {

                Toast.makeText(
                        LoginActivity.this,
                        "Please select your role",
                        Toast.LENGTH_SHORT
                ).show();

                return;
            }

            // Dashboard will be created next.
            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
            intent.putExtra("ROLE", selectedRole);
            startActivity(intent);
            finish();
        });
    }
}