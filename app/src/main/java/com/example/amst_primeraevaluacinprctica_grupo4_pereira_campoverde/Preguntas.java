package com.example.amst_primeraevaluacinprctica_grupo4_pereira_campoverde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import modelo.Pregunta;

public class Preguntas extends AppCompatActivity {
    ImageView imageView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    TextView idPregunta;
    Pregunta pregunta1;
    Pregunta pregunta2;
    Pregunta pregunta3;
    Pregunta pregunta4;
    Pregunta pregunta5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        imageView=(ImageView)findViewById(R.id.imagen);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);


        Bundle datos= this.getIntent().getExtras();
        pregunta1=datos.getParcelable("pregunta1");
        pregunta2=datos.getParcelable("pregunta2");
        pregunta3=datos.getParcelable("pregunta3");
        pregunta4=datos.getParcelable("pregunta4");
        pregunta5=datos.getParcelable("pregunta5");
        

    }
}