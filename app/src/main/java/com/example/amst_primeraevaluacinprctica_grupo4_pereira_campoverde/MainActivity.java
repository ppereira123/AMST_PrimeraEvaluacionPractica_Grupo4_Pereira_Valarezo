package com.example.amst_primeraevaluacinprctica_grupo4_pereira_campoverde;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Parcelable;

import android.os.Bundle;
import android.view.View;

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
        instrucciones alert= new instrucciones();
        new AlertDialog.Builder(this)
                .setTitle("Instrucciones")
                .setMessage("Bienvenidos al juego de Mega Cine" +
                        "\nPara ganar una entrada de cine debes responder 3 preguntas correctamente" +
                        "\nMucha suerte!!!")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automaticall
                // y dismissed when a dialog button is clicked.
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
}
    public void empezar(View view) {
        Intent intent2 = new Intent(this, Preguntas.class);
        startActivity(intent2);
    }
}