package com.child.go.go_child;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //slide animation exists here
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);


        setContentView(R.layout.activity_splash);
        //set the application orientation to portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Thread timer = new Thread() {

            public void run() {
                try {


                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    Intent intentStartWalkThrough = new Intent(getApplicationContext(), Walkthrough.class);
                    startActivity(intentStartWalkThrough);
                    finish();
                }
            }

        };

        timer.start();

    }
}