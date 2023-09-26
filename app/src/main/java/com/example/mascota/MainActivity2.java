package com.example.mascota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtResultado;
    ImageView imagen1;

    String nombre="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtResultado = findViewById(R.id.txtResultado);
        imagen1 = findViewById(R.id.imagen1);

        Bundle extras = getIntent().getExtras();


        if (extras != null) {
            nombre = extras.getString("nombre");// nombre es el ID que le dimos a str.
            txtResultado.setText("Su opinion fue: " + nombre);
        }

    }
    public void mostrar(View View){
        if (nombre.equalsIgnoreCase("Hermoso")){
            imagen1.setImageResource(R.drawable.perrohermoso);
        } else if (nombre.equalsIgnoreCase("Lindo")) {
            imagen1.setImageResource(R.drawable.perrolindo);
        } else if (nombre.equalsIgnoreCase("Normal")) {
            imagen1.setImageResource(R.drawable.perronormal);
        } else if (nombre.equalsIgnoreCase("Horroroso")) {
            imagen1.setImageResource(R.drawable.perrohorroroso);
        }


    }
    public void regresar (View S){
        Intent enviar = new Intent(MainActivity2.this,MainActivity.class);
        Bundle miBundle = new Bundle();
        enviar.putExtras(miBundle);
        startActivity(enviar);
    }
}