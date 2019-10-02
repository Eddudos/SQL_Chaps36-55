package com.android.dayoff;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    TextView text;
    SeekBar seek;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);

        text = (TextView) findViewById(R.id.text);


        seek = (SeekBar) findViewById(R.id.seek);


    }


    public static int getRandomIntegerBetweenRange(int max){
        int x = (int)(Math.random()*(max)+1);
        return x;
    }




    @Override
    public void onClick(View v) {

        int rand = getRandomIntegerBetweenRange(seek.getProgress());
        Log.d("myLogs", "lol = " + rand);

        text.setText(" " + rand + " ");

    }
}
