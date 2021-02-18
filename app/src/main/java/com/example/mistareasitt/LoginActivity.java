package com.example.mistareasitt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"fuente.ttf");
        TextView titulo_splash = (TextView) findViewById(R.id.titulo_splash);
        titulo_splash.setTypeface(miFuente);

    }
}