package com.example.foodcycleai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RouteOptimizationActivity extends AppCompatActivity {

    private TextView routeStatus;
    private TextView distanceValue;
    private TextView etaValue;
    private TextView routeRecommendation;
    private TextView co2Saving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_route_optimization);

        routeStatus = findViewById(R.id.routeStatus);
        distanceValue = findViewById(R.id.distanceValue);
        etaValue = findViewById(R.id.etaValue);
        routeRecommendation = findViewById(R.id.routeRecommendation);
        co2Saving = findViewById(R.id.co2Saving);

        Button optimizeRouteButton =
                findViewById(R.id.optimizeRouteButton);

        optimizeRouteButton.setOnClickListener(v -> {

            // Simulated AI route optimization

            routeStatus.setText("✅ Optimal route found");

            distanceValue.setText("Distance: 4.8 km");

            etaValue.setText("Estimated Time: 18 minutes");

            routeRecommendation.setText(
                    "AI recommends the shortest available route " +
                            "from the institutional kitchen to the community " +
                            "food bank. The route minimizes travel distance " +
                            "and pickup delay."
            );

            co2Saving.setText(
                    "🌱 Estimated CO₂ saving: 1.4 kg"
            );

            findViewById(R.id.routeResultCard)
                    .setVisibility(View.VISIBLE);
        });
    }
}