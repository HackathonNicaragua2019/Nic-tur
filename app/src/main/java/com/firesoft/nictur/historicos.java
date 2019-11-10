package com.firesoft.nictur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class historicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historicos);
    }

    public void ruinas(View view) {
        Intent intent = new Intent(this, ruinas.class);
        startActivity(intent);
    }
}
