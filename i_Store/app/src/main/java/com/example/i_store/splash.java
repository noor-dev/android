package com.example.i_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent( splash.this,MainActivity.class );
                startActivity(intent);
                finish();

            }
        },3000 );
    }

    public void login(View view) {
    }
}
