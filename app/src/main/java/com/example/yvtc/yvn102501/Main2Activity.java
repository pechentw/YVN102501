package com.example.yvtc.yvn102501;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity
    implements View.OnClickListener {
    Button btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button3)
        {
            Log.d("MYLOG", "這是按鈕三");
        }
        else if (v.getId() == R.id.button4)
        {
            Log.d("MYLOG", "這是按鈕四");
        }

    }
}
