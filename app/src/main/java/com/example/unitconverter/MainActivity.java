package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tv1,tv2;
    Button b1,b2,b3,b4;
    boolean cmm,mcm,gkg,kgg;

    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (EditText) findViewById(R.id.et1);
        tv2 = (EditText) findViewById(R.id.et2);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        //convert = (Button) findViewById(R.id.b5);

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(tv1!=null) {
                    x = Integer.parseInt(String.valueOf(tv1.getText()));
                    cmm = true;
                    float y =  x/100;
                    tv2.setText(x+"cm = "+String.valueOf(y)+"m");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1!=null) {
                    x = Integer.parseInt(String.valueOf(tv1.getText()));
                    mcm = true;
                    float y =  x*100;
                    tv2.setText(x+"m = "+String.valueOf(y)+"cm");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1!=null) {
                    x = Integer.parseInt(String.valueOf(tv1.getText()));
                    gkg = true;
                    float y = x/1000;
                    tv2.setText(x+"g = "+String.valueOf(y)+"kg");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1!=null) {
                    x = Integer.parseInt(String.valueOf(tv1.getText()));
                    kgg = true;
                    float y =  x*1000;
                    tv2.setText(x+"kg = "+String.valueOf(y)+"g");
                }
            }
        });


    }
}