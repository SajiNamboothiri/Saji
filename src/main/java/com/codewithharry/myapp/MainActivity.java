package com.codewithharry.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mycount = 0;
    Button btminus, btplus, btreset;
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