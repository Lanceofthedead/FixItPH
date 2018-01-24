package com.lanceofthedead.fixitph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etPhoneNumber = (EditText) findViewById(R.id.edit_text_phone_number);

        /** Initializes and finds the view that shows the Button for registration activity **/
        Button registration = (Button) findViewById(R.id.button_send_verification_code);

        /** Set a click listener on the send verification code button **/
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** create a new intent to open {@link RegistrationActivity} **/
                Intent registration1Intent = new Intent(MainActivity.this, RegistrationActivity.class);

                /** starts the activity **/
                startActivity(registration1Intent);
            }
        });
    }
        /** Setting onClick to text_view_go_here **/
        public void goHere(View view){
        /** Initializes and finds the view that shows the clickable text "Go Here" for registration activity **/
        TextView tvGoHere = (TextView) findViewById(R.id.text_view_go_here);

        /** Set a click listener on the Go Here text view to go to {@link LogInActivity} **/
        tvGoHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** create a new intent to open {@link LogInActivity} **/
                Intent goHereIntent = new Intent(MainActivity.this, LogInActivity.class);

                /** starts the activity **/
                startActivity(goHereIntent);
            }
        });


    }
}
