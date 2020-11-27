package com.example.amst_primeraevaluacinprctica_grupo4_pereira_campoverde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import modelo.Pregunta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pregunta pregunta1= new Pregunta();
    }
}