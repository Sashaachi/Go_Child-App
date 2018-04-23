package com.child.go.go_child;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog reportDialog;
    private LinearLayout reportCaseLinearLayout,bookALawyer,joinUs,typesOfCases,moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reportDialog = new Dialog(this);

        reportCaseLinearLayout = (LinearLayout) findViewById(R.id.reportCase);
        bookALawyer=(LinearLayout)findViewById(R.id.contactALawyer);
        joinUs=(LinearLayout)findViewById(R.id.joinUS);
        typesOfCases=(LinearLayout)findViewById(R.id.typesOfCases);
        moreInfo=(LinearLayout)findViewById(R.id.moreInfo);

        moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreInfoIntent=new Intent(getApplicationContext(),Info.class);
                startActivity(moreInfoIntent);
            }
        });
        bookALawyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bookALawyer=new Intent(getApplicationContext(),BookALawyer.class);
                startActivity(bookALawyer);
            }
        });


        typesOfCases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent typesOfCaseIntent=new Intent(getApplicationContext(),TypesOfCases.class);
                startActivity(typesOfCaseIntent);
            }
        });

        reportCaseLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView txtclose;
                Button btnFollow;
                reportDialog.setContentView(R.layout.report_case);
                txtclose = (TextView) reportDialog.findViewById(R.id.txtclose);
                txtclose.setText("M");
                btnFollow = (Button) reportDialog.findViewById(R.id.btnfollow);
                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        reportDialog.dismiss();
                    }
                });
                reportDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                reportDialog.show();
            }
        });

        joinUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView txtclose;
                Button btnFollow;
                reportDialog.setContentView(R.layout.join_us);
                txtclose = (TextView) reportDialog.findViewById(R.id.txtclose);
                txtclose.setText("M");
                btnFollow = (Button) reportDialog.findViewById(R.id.btnfollow);
                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        reportDialog.dismiss();
                    }
                });
                reportDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                reportDialog.show();
            }
        });


    }


}
