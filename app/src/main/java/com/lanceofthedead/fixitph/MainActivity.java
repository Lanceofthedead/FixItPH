package com.lanceofthedead.fixitph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etPhoneNumber = (EditText) findViewById(R.id.edit_text_phone_number);

        //Finds the view that shows the Button for registration activity
        Button registration = (Button) findViewById(R.id.button_send_verification_code);


        //Set a click listener on the send verification code button
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open {@link RegistrationActivity}
                Intent registration1Intent = new Intent(MainActivity.this, RegistrationActivity.class);

                //start the new activity
                startActivity(registration1Intent);
            }
        });


    }
}
