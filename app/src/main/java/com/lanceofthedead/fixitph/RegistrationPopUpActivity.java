package com.lanceofthedead.fixitph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

public class RegistrationPopUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_pop_up);


        /** to set up pop up window inside {@link RegistrationPopUpActivity}**/
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .6));
    }

        /** Setting onClick to text_view_continue_to_login **/
    public void continueToLogin(View view){
        /** Initializes and finds the view that shows the clickable text "Go Here" for registration activity **/
        TextView tvContinueToLogin = (TextView) findViewById(R.id.text_view_continue_to_login);

        /** Set a click listener on the Go Here text view to go to {@link LogInActivity} **/
        tvContinueToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** create a new intent to open {@link RegistrationPopUpActivity} **/
                Intent continueToLoginIntent = new Intent(RegistrationPopUpActivity.this, LogInActivity.class);

                /** start the new activity **/
                startActivity(continueToLoginIntent);
            }
        });



    }
}
