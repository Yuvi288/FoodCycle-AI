package com.example.foodcycleai;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private String selectedRole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);

        selectedRole = getIntent().getStringExtra("ROLE");

        // =========================
        // Dashboard Views
        // =========================

        TextView greetingText =
                findViewById(R.id.greetingText);

        Button predictButton =
                findViewById(R.id.predictButton);

        Button scanButton =
                findViewById(R.id.scanButton);

        Button surplusButton =
                findViewById(R.id.surplusButton);

        Button reportButton =
                findViewById(R.id.reportButton);


        // =========================
        // Bottom Navigation
        // =========================

        TextView inventoryNav =
                findViewById(R.id.inventoryNav);

        TextView redistributeNav =
                findViewById(R.id.redistributeNav);

        TextView impactNav =
                findViewById(R.id.impactNav);


        // =========================
        // Inventory
        // =========================

        inventoryNav.setOnClickListener(v -> {

            Intent intent = new Intent(
                    DashboardActivity.this,
                    InventoryActivity.class
            );

            startActivity(intent);
        });


        // =========================
        // Redistribute
        // =========================

        redistributeNav.setOnClickListener(v -> {

            Intent intent = new Intent(
                    DashboardActivity.this,
                    SurplusActivity.class
            );

            startActivity(intent);
        });


        // =========================
        // Impact
        // =========================

        impactNav.setOnClickListener(v -> {

            Intent intent = new Intent(
                    DashboardActivity.this,
                    ImpactActivity.class
            );

            startActivity(intent);
        });


        // =========================
        // Institutional Kitchen
        // =========================

        if (selectedRole != null
                && selectedRole.equals("Institutional Kitchen")) {

            greetingText.setText(
                    "Kitchen Dashboard 👋"
            );

            predictButton.setText(
                    "📊\nAI Demand"
            );

            scanButton.setText(
                    "📷\nFood Quality"
            );

            surplusButton.setText(
                    "📦\nAdd Surplus"
            );

            reportButton.setText(
                    "📈\nReports"
            );


            // AI Demand
            predictButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        DemandPredictionActivity.class
                );

                startActivity(intent);
            });


            // Food Quality
            scanButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        FoodQualityActivity.class
                );

                startActivity(intent);
            });


            // Add Surplus
            surplusButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        SurplusActivity.class
                );

                startActivity(intent);
            });


            // Reports
            reportButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        ImpactActivity.class
                );

                startActivity(intent);
            });
        }


        // =========================
        // Food Processing Unit
        // =========================

        else if (selectedRole != null
                && selectedRole.equals("Food Processing Unit")) {

            greetingText.setText(
                    "Processing Dashboard 👋"
            );

            predictButton.setText(
                    "📊\nProduction"
            );

            scanButton.setText(
                    "📷\nQuality"
            );

            surplusButton.setText(
                    "📦\nRaw Materials"
            );

            reportButton.setText(
                    "📈\nEfficiency"
            );


            // Production
            predictButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        ProductionActivity.class
                );

                startActivity(intent);
            });


            // Quality
            scanButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        ProcessingQualityActivity.class
                );

                startActivity(intent);
            });


            // Raw Materials
            surplusButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        InventoryActivity.class
                );

                startActivity(intent);
            });


            // Efficiency
            reportButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        ProductionActivity.class
                );

                startActivity(intent);
            });
        }


        // =========================
        // NGO / Food Bank
        // =========================

        else if (selectedRole != null
                && selectedRole.equals("NGO / Food Bank")) {

            greetingText.setText(
                    "NGO Dashboard 👋"
            );

            predictButton.setText(
                    "🍱\nAvailable Food"
            );

            scanButton.setText(
                    "📋\nRequests"
            );

            surplusButton.setText(
                    "🚚\nPickup"
            );

            reportButton.setText(
                    "🌱\nImpact"
            );


            // Available Food
            predictButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        NGOFoodActivity.class
                );

                startActivity(intent);
            });


            // Requests
            scanButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        NGOFoodActivity.class
                );

                startActivity(intent);
            });


            // Pickup
            surplusButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        NGOFoodActivity.class
                );

                startActivity(intent);
            });


            // Impact
            reportButton.setOnClickListener(v -> {

                Intent intent = new Intent(
                        DashboardActivity.this,
                        ImpactActivity.class
                );

                startActivity(intent);
            });
        }
    }


    // =========================
    // BACK BUTTON
    // Return to Role Selection
    // =========================

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(
                DashboardActivity.this,
                LoginActivity.class
        );

        intent.addFlags(
                Intent.FLAG_ACTIVITY_CLEAR_TOP
                        | Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK
        );

        startActivity(intent);

        finish();
    }
}