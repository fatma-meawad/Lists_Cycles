package com.example.fatma.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
public class ListTwoActivity extends AppCompatActivity {

    ListView listView=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_two);
        int count=getIntent().getIntExtra("valueint",0);
        Toast.makeText(getApplicationContext(),"List Two  onCreate "+count,Toast.LENGTH_SHORT).show();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data


        Button mButtonStart = (Button) findViewById(R.id.buttonstart);


        // add listener, starts or stops the tracker in the FaceTrackingSerivice
        mButtonStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int count=getIntent().getIntExtra("valueint",0);

                String[] values = new String[count];

                for (int i=0; i<count;i++){
                    values[i]="Contact "+i;
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_2, android.R.id.text2, values);

                // Assign adapter to ListView
                listView = (ListView) findViewById(R.id.list);
                listView.setAdapter(adapter);
                listView.setBackgroundColor(Color.rgb(0, 0, 0));


                // ListView Item Click Listener
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        // ListView Clicked item index
                        int itemPosition     = position;
                        // ListView Clicked item value
                        String  itemValue    = (String) listView.getItemAtPosition(position);
                        // Show Alert
                        Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_SHORT)
                                .show();

                    }

                });
            }
        });

        // Defined Array values to show in ListView



    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"List Two  onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"List Two onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"List Two onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"List Two onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"List Two onStart",Toast.LENGTH_SHORT).show();
    }
}
