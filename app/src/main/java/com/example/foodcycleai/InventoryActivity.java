package com.example.foodcycleai;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_inventory);

        Button addStockButton = findViewById(R.id.addStockButton);

        addStockButton.setOnClickListener(v -> {
            Toast.makeText(
                    InventoryActivity.this,
                    "Add inventory feature coming next",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}