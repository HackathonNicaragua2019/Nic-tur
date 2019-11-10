package com.firesoft.nictur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    public void recre(View view) {
        Intent intent = new Intent(this,recreativos.class);
        startActivity(intent);
    }

    public void resta(View view) {
        Intent intent = new Intent(this,restaurantes.class);
        startActivity(intent);
    }

    public void histo(View view) {
        Intent intent = new Intent(this,historicos.class);
        startActivity(intent);
    }

    public void hosta(View view) {
        Intent intent = new Intent(this,hostales.class);
        startActivity(intent);
    }

    public void entrete(View view) {
        Intent intent = new Intent(this, entretenimiento.class);
        startActivity(intent);
    }

    public void eventos(View view) {
        Intent intent = new Intent(this, eventos.class);
        startActivity(intent);
    }

    public void ini(View view) {
        Intent intent = new Intent(this, eventos.class);
        startActivity(intent);

    }

}
