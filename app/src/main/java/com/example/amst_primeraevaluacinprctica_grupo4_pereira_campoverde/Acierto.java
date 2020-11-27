package com.example.amst_primeraevaluacinprctica_grupo4_pereira_campoverde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Acierto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acierto);
    }

    public void salir(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}