package com.example.jesus.dessertandcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Jesus on 4/17/2016.
 */
public class BlankSplash extends Activity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blank_splash);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}