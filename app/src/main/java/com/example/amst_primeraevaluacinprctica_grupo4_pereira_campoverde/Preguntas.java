package com.example.amst_primeraevaluacinprctica_grupo4_pereira_campoverde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    ArrayList<Pregunta> preguntas= new ArrayList<>();
    int respuestasCorrecta=0;
    ArrayList<Integer> opcionesSalidas=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        imageView=(ImageView)findViewById(R.id.imagen);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        idPregunta=(TextView)findViewById(R.id.idPregunta);
        iniciarPreguntas();
        escogerPregunta();
    }
    public void escogerPregunta(){
        int n=numeroAleatorio();
        Pregunta p=preguntas.get(n);
        setearPregunta(p);
        asignarOpcionCorrecta(p);
    }
    public void setearPregunta(Pregunta p){
        idPregunta.setText(p.getPregunta());
        button1.setText(p.getOpcion1());
        button2.setText(p.getOpcion2());
        button3.setText(p.getOpcion3());
        button4.setText(p.getOpcion4());
        int r=p.getImagen();
        imageView.setImageResource(r);
    }
    public void iniciarPreguntas(){
        Pregunta pregunta1= new Pregunta("Quien es este personaje de la saga de Harry Potter?","Ron","Hermione","Voldemort","Draco Malfoy","Draco Malfoy",R.mipmap.draco);
        Pregunta pregunta2= new Pregunta("Que personaje perdio una zapatilla","Blanca Nieves","La bella durmiente","Cenicienta","Rapunzel","Cenicienta",R.mipmap.cenicienta);
        Pregunta pregunta3= new Pregunta("Como se llama este personaje?","Chuwaka","Baby Yoda","Obi wan","Luke","Baby Yoda",R.mipmap.babyyoda);
        Pregunta pregunta4= new Pregunta("Como se llama la hermana de Luke SkyWalker?","Leia","Padme ","Jessica","Zola","Leia",R.mipmap.leya);
        Pregunta pregunta5= new Pregunta("Quien es la novia de la bestia?","Blanca Nieves","Bella","Malefica","Cenicienta","Bella",R.mipmap.bella);
        this.preguntas.add(pregunta1);
        this.preguntas.add(pregunta2);
        this.preguntas.add(pregunta3);
        this.preguntas.add(pregunta4);
        this.preguntas.add(pregunta5);
    }
    public int numeroAleatorio(){
        Random randon=new Random();
        int n= randon.nextInt(4)+1;
        while(opcionesSalidas.contains(n)){
            n= randon.nextInt(4)+1;
        }
        opcionesSalidas.add(n);
        return n;
    }
    public Intent getIntent(){
        Intent intent=new Intent(this,Falla.class);
        return intent;
    }
    public void ganoEntrada(){
        if(respuestasCorrecta==3){
            Intent intent=new Intent(this,Acierto.class);
            startActivity(intent);
        }
    }

    public void falla(View view){
        Intent intent= new Intent(this,Falla.class);
        startActivity(intent);
    }

    public void asignarOpcionCorrecta(Pregunta pregunta){
        ArrayList<Button> opciones= new ArrayList<>();
        opciones.add(button1);
        opciones.add(button2);
        opciones.add(button3);
        opciones.add(button4);

        for(Button i:opciones){
            if(i.getText().equals(pregunta.getOpcionCorrecta())){
                i.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        respuestasCorrecta++;
                        int n=numeroAleatorio();
                        Pregunta p=preguntas.get(n);
                        setearPregunta(p);
                        asignarOpcionCorrecta(p);
                        ganoEntrada();

                    }
                });
            }
        }

    }

}