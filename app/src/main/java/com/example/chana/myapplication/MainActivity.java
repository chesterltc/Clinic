package com.example.chana.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;

import static android.R.attr.button;
import static android.R.attr.checked;
import static android.R.attr.id;
import static android.R.id.toggle;
import static com.example.chana.myapplication.R.id.RG;



public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    public void nextpage(View v) {
        RadioButton rb1 = (RadioButton)findViewById(R.id.PatientradioButton);
        RadioButton rb2 = (RadioButton)findViewById(R.id.DoctorradioButton);

        if(rb1.isChecked())
                    startActivity(new Intent(MainActivity.this, PatientActivity.class));

        if(rb2.isChecked())
                    startActivity(new Intent(MainActivity.this, DoctorActivity.class));
    }
    }


