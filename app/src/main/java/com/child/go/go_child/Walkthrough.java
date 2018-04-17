package com.child.go.go_child;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.child.go.go_child.login.Login;
import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnRightOutListener;

import java.util.ArrayList;

public class Walkthrough extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //setup the pages
        PaperOnboardingPage scr1 = new PaperOnboardingPage("Welcome",
                "Go-Child is an app designed to provide child protection services to all persons under the age of 18.",
                Color.parseColor("#3f045e"),
                R.drawable.ic_assignment_ind_black_24dp,
                R.drawable.ic_assignment_ind_black_24dp);


        PaperOnboardingPage scr2 = new PaperOnboardingPage("Report",
                "Go-Child will be used to report such cases and find information on the right approach to these problems.",
                Color.parseColor("#3f045e"),
                R.drawable.ic_report_black_24dp,
                R.drawable.ic_report_black_24dp);


        PaperOnboardingPage scr3 = new PaperOnboardingPage("Book a Lawyer",
                "The platform will also be used to find and book relevant children lawyers to represent the victims at low costs.",
                Color.parseColor("#3f045e"),
                R.drawable.ic_library_books_black_24dp,
                R.drawable.ic_library_books_black_24dp);


        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);

        PaperOnboardingFragment onBoardingFragment = PaperOnboardingFragment.newInstance(elements);

        onBoardingFragment.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
            @Override
            public void onRightOut() {
                Intent mainIntent = new Intent(Walkthrough.this, Login.class);
                startActivity(mainIntent);
                finish();
            }
        });

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, onBoardingFragment).commit();


    }
}