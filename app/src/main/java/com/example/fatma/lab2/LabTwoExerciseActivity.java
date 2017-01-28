package com.example.fatma.lab2;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LabTwoExerciseActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_memory_exercise);
        Toast.makeText(getApplicationContext(),"MainActivity onCreate",Toast.LENGTH_SHORT).show();

        TextView lOne = (TextView) findViewById(R.id.lone);
        // Set a click listener on that View
        lOne.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the regular list is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the
                Intent rIntent = new Intent(LabTwoExerciseActivity.this, ListOneActivity.class);
                // Start the new activity
                startActivity(rIntent);
            }
        });




        TextView lTwo = (TextView) findViewById(R.id.ltwo);
        // Set a click listener on that View
        lTwo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when
            @Override
            public void onClick(View view) {
                // Create a new intent to open the
                Intent aIntent = new Intent(LabTwoExerciseActivity.this, ListTwoActivity.class);
                // Start the new activity
                startActivity(aIntent);
            }
        });




    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"MainActivity onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"MainActivity onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"MainActivity onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"MainActivity onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"MainActivity onStart",Toast.LENGTH_SHORT).show();
    }
}
