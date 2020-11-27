package com.example.amst_primeraevaluacinprctica_grupo4_pereira_campoverde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
<<<<<<< Updated upstream
import android.media.Image;
import android.os.Bundle;
import android.os.Parcelable;
=======
import android.os.Bundle;
import android.view.View;
>>>>>>> Stashed changes

import modelo.Pregunta;

public class MainActivity extends AppCompatActivity {
    Pregunta pregunta1;
    Pregunta pregunta2;
    Pregunta pregunta3;
    Pregunta pregunta4;
    Pregunta pregunta5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pregunta pregunta1= new Pregunta("Quien es este personaje de la saga de Harry Potter?","Ron","Hermione","Voldemort","Draco Malfoy","Draco Malfoy","dracomalfoy");
        Pregunta pregunta2= new Pregunta("Que personaje perdio una zapatilla","Blanca Nieves","La bella durmiente","Cenicienta","Rapunzel","Rapunzel","cenicienta");
        Pregunta pregunta3= new Pregunta("Como se llama este personaje?","Chuwaka","Baby Yoda","Obi wan","Luke","Baby Yoda","babyyoda");
        Pregunta pregunta4= new Pregunta("Como se llama la hermana de Luke SkyWalker?","Leia","Padme ","Jessica","Zola","Leia","leya");
        Pregunta pregunta5= new Pregunta("Quien es la novia de la bestia?","Blanca Nieves","Bella","Malefica","Cenicienta","Bella","bella");
        Intent intent= new Intent(this,Preguntas.class);
        intent.putExtra("pregunta1", (Parcelable) pregunta1);
        intent.putExtra("pregunta2", (Parcelable) pregunta2);
        intent.putExtra("pregunta3", (Parcelable) pregunta3);
        intent.putExtra("pregunta4", (Parcelable) pregunta4);
        intent.putExtra("pregunta5", (Parcelable) pregunta5);

    }
    public void empezar(View view) {
        Intent intent2 = new Intent(this, Preguntas.class);
        startActivity(intent2);
    }
}