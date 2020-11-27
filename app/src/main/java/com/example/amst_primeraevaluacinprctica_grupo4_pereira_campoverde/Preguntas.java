package com.example.amst_primeraevaluacinprctica_grupo4_pereira_campoverde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class Preguntas extends AppCompatActivity {
    ImageView imageView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    TextView idPregunta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        imageView=(ImageView)findViewById(R.id.imagen);
        button1=(Button)findViewById(R.id.button1);
    }
}