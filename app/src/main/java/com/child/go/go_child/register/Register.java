package com.child.go.go_child.register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.child.go.go_child.MainActivity;
import com.child.go.go_child.R;

public class Register extends AppCompatActivity {

    private Button startRegButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //slide animation exists here
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        setContentView(R.layout.activity_register_one);

        startRegButton = (Button) findViewById(R.id.startButton);

        startRegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(screenMain);
            }
        });
    }
}
