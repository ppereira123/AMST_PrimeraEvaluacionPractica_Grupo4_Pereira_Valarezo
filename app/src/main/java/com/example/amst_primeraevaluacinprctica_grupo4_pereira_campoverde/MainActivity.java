package com.example.amst_primeraevaluacinprctica_grupo4_pereira_campoverde;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

import modelo.Pregunta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pregunta pregunta1= new Pregunta("Quien es este personaje de la saga de Harry Potter?","Ron","Hermione","Voldemort","Draco Malfoy","Draco Malfoy","DracoMalfoy");
        Pregunta pregunta2= new Pregunta("Que personaje perdio una zapatilla","Blanca Nieves","La bella durmiente","Cenicienta","Rapunzel","Rapunzel","cenicienta");
        Pregunta pregunta3= new Pregunta("Como se llama este personaje?","Chuwaka","Baby Yoda","Obi wan","Luke","Baby Yoda","babyyoda");
        Pregunta pregunta4= new Pregunta("Como se llama la hermana de Luke SkyWalker?","Leia","Padme ","Jessica","Zola","Leia","leya");
        Pregunta pregunta5= new Pregunta("Quien es la novia de la bestia?","Blanca Nieves","Bella","Malefica","Cenicienta","Bella","bella");
    }
}