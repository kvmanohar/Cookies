package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeImage(View view) {
        TextView textView = (TextView) findViewById(R.id.textDisplayMessage);
        ImageView imgView = (ImageView) findViewById(R.id.cookieImage);
        Button btView = (Button) findViewById(R.id.button_eat_cookie);

        if (textView.getText() == "I'm so hungry")
        {
            textView.setText("I'm so full");
            imgView.setImageResource(R.drawable.after_cookie);
            btView.setText("GET COOKIE");
        }
        else
        {
            textView.setText("I'm so hungry");
            imgView.setImageResource(R.drawable.before_cookie);
            btView.setText("EAT COOKIE");
        }
    }
}
