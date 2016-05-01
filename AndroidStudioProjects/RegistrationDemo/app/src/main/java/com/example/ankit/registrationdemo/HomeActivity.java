package com.example.ankit.registrationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    private TextView mTxtName;
    private TextView mTxtSex;
    private TextView mTxtMarriage;
    private TextView mTxtCity;
    private TextView mTxtState;
    private TextView mTxtQualification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();
    }

    private void init() {
        mTxtName = (TextView) findViewById(R.id.txtName);
        mTxtSex = (TextView) findViewById(R.id.txtSex);
        mTxtMarriage = (TextView) findViewById(R.id.txtMarriage);
        mTxtQualification = (TextView) findViewById(R.id.txtQualification);
        mTxtCity = (TextView) findViewById(R.id.txtCity);
        mTxtState = (TextView) findViewById(R.id.txtState);

        getInfoSetup();
    }

    private void getInfoSetup() {

        Intent intent = getIntent();
        mTxtName.setText("Name : " + intent.getStringExtra("Name"));
        mTxtSex.setText("Sex : " + intent.getStringExtra("sex"));
        mTxtMarriage.setText("Marraige Status : " + intent.getStringExtra("marriage"));
        mTxtQualification.setText("Qualification : " + intent.getStringExtra("qualification"));
        mTxtCity.setText("City : " + intent.getStringExtra("city"));
        mTxtState.setText("State : " + intent.getStringExtra("state"));


    }
}
