package com.gywang.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = (TextView)findViewById(R.id.tv_hello);

        tv_hello.setText("第一个安卓程序");
        tv_hello.setTextColor(Color.GREEN);

        tv_hello.setTextSize(30);
    }
}
