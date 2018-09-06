package com.gtc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import hello.Hello;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt = (TextView)findViewById(R.id.tv_hello);
        final EditText et = (EditText)findViewById(R.id.et_edit);
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(Hello.greetings(et.getText().toString().trim()));
            }
        });

    }
}
