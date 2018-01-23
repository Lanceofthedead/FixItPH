package com.lanceofthedead.fixitph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistrationActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration2);

        //Finds the view that shows the next button
        Button next2 = (Button) findViewById(R.id.button_next2);

        //Set a click listener on the NEXT button for RegistrationSummaryActivity
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open {@link RegistrationActivity2}
                Intent RegistrationSummaryIntent = new Intent(RegistrationActivity2.this, RegistrationSummaryActivity.class);

                //start the new activity
                startActivity(RegistrationSummaryIntent);
            }
        });


        //Finds the view that shows the back button
        Button back = (Button) findViewById(R.id.button_back);

        //Set a click listener on the NEXT button on RegistrationActivity2
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open {@link RegistrationActivity2}
                Intent backIntent = new Intent(RegistrationActivity2.this, RegistrationActivity.class);

                //start the new activity
                startActivity(backIntent);
            }
        });

        //setting up spinner for spinner city
        final Spinner spinnerCity = (Spinner) findViewById(R.id.spinner_city);

        //initializing a String array for city
        String[] city = new String[]{
                "Choose City...", "Caloocan", "Las Pinas", "Makati", "Malabon", "Mandaluyong",
                "Marikina", "Muntilupa", "Navotas", "Paranaque", "Pasay",
                "Pasig", "San Juan", "Taguig", "Valenzuela", "Pateros"
        };

        final List<String> cityList = new ArrayList<>(Arrays.asList(city));

        //initializing ArrayAdapter
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item, cityList) {
            @Override
            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                return view;
            }
        };

        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_item);
        spinnerCity.setAdapter(spinnerArrayAdapter);

        //setting up spinner for spinner region
        final Spinner spinnerRegion = (Spinner) findViewById(R.id.spinner_region);

        //initializing a String array for city
        String[] region = new String[]{
                "*Metro Manila"
        };

        final List<String> regionList = new ArrayList<>(Arrays.asList(region));

        //initializing ArrayAdapter
        final ArrayAdapter<String> spinnerArrayAdapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item, regionList) {
            @Override
            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                return view;
            }
        };

        spinnerArrayAdapter2.setDropDownViewResource(R.layout.spinner_item);
        spinnerRegion.setAdapter(spinnerArrayAdapter2);





    }

    //get cityItem value
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String cityItem = parent.getItemAtPosition(position).toString();

    }





}



