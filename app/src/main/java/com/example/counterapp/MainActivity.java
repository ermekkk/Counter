package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.txt);
    }

    public void increment(View v){
        count++;
        String s = " ";
        if(count <= 9)
            s = "000%d";
        else if(count > 9 && count <= 99)
            s = "00%d";
        else if(count > 99 && count <= 999)
            s = "0%d";
        else if(count > 999)
            s = "%d";
        textView.setText(String.format(s, count));
    }
}