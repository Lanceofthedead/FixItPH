package com.lanceofthedead.fixitph;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    /** Duration of splash **/
    private final int SPLASH_DISPLAY_LENGTH = 1200;

    /** initialization of views in splash **/
    private TextView tv6;
    private ImageView iv;
    private ProgressBar pb;



    @SuppressLint("ObjectAnimatorBinding")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /** location of the views **/
        tv6 = (TextView) findViewById(R.id.textView6);
        iv = (ImageView) findViewById(R.id.imageView2);
        pb = (ProgressBar)findViewById(R.id.progressBar);





        /** setting up animation to chosen views **/
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv6.startAnimation(myanim);
        iv.startAnimation(myanim);


        final Intent i = new Intent(SplashActivity.this,MainActivity.class);
        final Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();

                }
            }
        };
        timer.start();

    }

}


