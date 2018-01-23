package com.lanceofthedead.fixitph;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class RegistrationActivity extends AppCompatActivity {

    //initialization for DatePicker
    private static final String TAG = "RegistrationActivity";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        //setting up DatePicker
        mDisplayDate = (TextView) findViewById(R.id.text_view_select_date);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(RegistrationActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth, mDateSetListener,year,month,day);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyyy: " +month+ "/" +dayOfMonth+ "/" +year);

                String date = month+ "/" +dayOfMonth+ "/" +dayOfMonth+ "/" +year;
                mDisplayDate.setText(date);
            }
        };

        //Finds the view that shows the Button for registration
        Button next = (Button) findViewById(R.id.button_next);


        //Set a click listener on the CONTINUE REGISTER button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open {@link RegistrationActivity}
                Intent registration2Intent = new Intent(RegistrationActivity.this, RegistrationActivity2.class);

                //start the new activity
                startActivity(registration2Intent);
            }
        });
    }
}
