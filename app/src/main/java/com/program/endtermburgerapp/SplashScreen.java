package com.program.endtermburgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class SplashScreen extends AppCompatActivity {
    private TextView textView_message;
    String[] _message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        InitializeComponents();

        Log.d("arrayMessage",_message.toString());

        Handler _handler = new Handler();
        Random _rand = new Random();

        textView_message.setText( _message[_rand.nextInt(_message.length)]);

        _handler.postDelayed(() -> {
            Intent intent_homeScreen = new Intent(SplashScreen.this, view_product.class);
            startActivity(intent_homeScreen);
            finish();
        }, 4000);
    }
    private void InitializeComponents(){
        getSupportActionBar().hide();
        _message = getResources().getStringArray(R.array.splash_messages);
        textView_message = findViewById(R.id.textView_message);

    }
}