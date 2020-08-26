package com.codewithharry.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mycount = 0;
    Button btminus, btplus, btreset, btcol1, btcol2, btcol3, btcol4, btcol5, btcol6;
    TextView txhead, txcou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txhead = findViewById(R.id.txhead);
        txcou = findViewById(R.id.txcou);
        btminus = findViewById(R.id.btminus);
        btplus = findViewById(R.id.btplus);
        btreset = findViewById(R.id.btreset);
        btcol1 = findViewById(R.id.btcol1);
        btcol2 = findViewById(R.id.btcol2);
        btcol3 = findViewById(R.id.btcol3);
        btcol4 = findViewById(R.id.btcol4);
        btcol5 = findViewById(R.id.btcol5);
        btcol6 = findViewById(R.id.btcol6);
// Colors
        btcol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txcou.setTextColor(Color.parseColor("#ff0088"));
            }
        });

        btcol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txcou.setTextColor(Color.parseColor("#047745"));
            }
        });

        btcol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txcou.setTextColor(Color.parseColor("#0048FF"));
            }
        });

        btcol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txcou.setTextColor(Color.parseColor("#FF5722"));
            }
        });

        btcol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txcou.setTextColor(Color.parseColor("#FD6A7504"));
            }
        });

        btcol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txcou.setTextColor(Color.parseColor("#730219"));
            }
        });



        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mycount == 0){}
                else {
                    mycount = mycount - 1;
                    txcou.setText(mycount + "");
                }

            }
        });
        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mycount = mycount + 1;
            txcou.setText(mycount + "");
            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mycount = 0;
            txcou.setText(mycount + "");
            }
        });


    }


}