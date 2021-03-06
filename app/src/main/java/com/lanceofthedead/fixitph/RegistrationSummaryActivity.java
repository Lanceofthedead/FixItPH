package com.lanceofthedead.fixitph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RegistrationSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_summary);


        /** Finds the view that shows the back button **/
        Button back2 = (Button) findViewById(R.id.button_back2);

        /** Set a click listener on the NEXT button of RegistrationSummaryActivity **/
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** create a new intent to open {@link RegistrationActivity2} **/
                Intent backIntent = new Intent(RegistrationSummaryActivity.this, RegistrationActivity2.class);

                /** start the new activity **/
                startActivity(backIntent);
            }
        });

        /** Finds the view that shows the back button **/
        Button bRegister = (Button) findViewById(R.id.button_register);

        /** Set a click listener on the REGISTER button on RegistrationSummaryActivity **/
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** create a new intent to open {@link RegistrationPopUpActivity} **/
                Intent registerIntent = new Intent(RegistrationSummaryActivity.this, RegistrationPopUpActivity.class);

                /** start the new activity **/
                startActivity(registerIntent);
            }
        });
    }
}
