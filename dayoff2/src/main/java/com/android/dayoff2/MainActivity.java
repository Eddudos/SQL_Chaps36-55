package com.android.dayoff2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (TextView) findViewById(R.id.text);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn1:
                text.setText(Float.parseFloat(text.getText().toString()) +  1 + " ");
                break;
            case R.id.btn2:
                text.setText(Float.parseFloat(text.getText().toString()) -  1 + " ");
                break;
            default:
                break;
        }


    }
}
