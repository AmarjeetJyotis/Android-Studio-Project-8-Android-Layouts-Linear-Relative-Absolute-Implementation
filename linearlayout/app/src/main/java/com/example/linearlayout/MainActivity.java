package com.example.linearlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to handle click of Button 1
    public void onButton1Click(View view) {
        // Handle Button 1 click here
        Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
    }

    // Method to handle click of Button 2
    public void onButton2Click(View view) {
        // Handle Button 2 click here
        Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
    }
}
