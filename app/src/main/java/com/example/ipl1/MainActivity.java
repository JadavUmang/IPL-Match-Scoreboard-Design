package com.example.ipl1;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    Button  btngt;
    Button btnrr;
    ListView squard;
    String gt[];
    String rr[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngt=findViewById(R.id.gt);
        btnrr=findViewById(R.id.rr);
        squard = findViewById(R.id.squard);
        gt =getResources().getStringArray(R.array.gt11);
        rr =getResources().getStringArray(R.array.rr11);

        ArrayAdapter gtSquard = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,gt);
        ArrayAdapter rrSquard = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,rr);
        squard.setAdapter(gtSquard);
        btngt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                squard.setAdapter(gtSquard);
            }
        });
        btnrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                squard.setAdapter(rrSquard);
            }
        });

    }
}