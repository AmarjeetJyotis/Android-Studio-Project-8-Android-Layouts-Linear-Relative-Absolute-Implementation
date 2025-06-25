package com.example.absolutelayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView heading, subHeading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencing the TextViews
        heading = findViewById(R.id.heading);
        subHeading = findViewById(R.id.subHeading);

        // Setting text dynamically
        heading.setText("Chandigarh University");
        subHeading.setText("MAD");

        // Referencing the Button
        Button myButton = findViewById(R.id.myButton);

        // Setting OnClickListener for the Button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying Toast message upon button click
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

