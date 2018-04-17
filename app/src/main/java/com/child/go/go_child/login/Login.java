package com.child.go.go_child.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.child.go.go_child.MainActivity;
import com.child.go.go_child.R;
import com.child.go.go_child.register.Register;

public class Login extends AppCompatActivity {

    private TextView signUpLinkTextView;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //slide animation exists here
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        setContentView(R.layout.activity_login);

        //signUp link
        signUpLinkTextView = (TextView) findViewById(R.id.signUpLink);
        loginButton=(Button)findViewById(R.id.buttonLogin);

        signUpLinkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signUpLink = new Intent(getApplicationContext(), Register.class);
                startActivity(signUpLink);

            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(screenMain);
            }
        });
    }


}