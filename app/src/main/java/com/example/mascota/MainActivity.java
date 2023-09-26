package com.example.mascota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rbgrupo;
    RadioButton rbHermoso,rbLindo,rbNormal,rbHorroroso;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = (ImageView) findViewById(R.id.imagen);
        rbHermoso = (RadioButton) findViewById(R.id.rbHermoso);
        rbLindo = (RadioButton) findViewById(R.id.rbLindo);
        rbNormal = (RadioButton) findViewById(R.id.rbNormal);
        rbHorroroso = (RadioButton) findViewById(R.id.rbHorroroso);
        rbgrupo = (RadioGroup) findViewById(R.id.grupo);
        // este codigo es para mostrar las imagenes cada ves que selecionamos una opcion del radiobutton
        rbgrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rbHermoso:
                        imagen.setImageDrawable(getResources().getDrawable(R.drawable.perrohermoso));
                        break;
                    case R.id.rbLindo:
                        imagen.setImageDrawable(getResources().getDrawable(R.drawable.perrolindo));
                        break;
                    case R.id.rbNormal:
                        imagen.setImageDrawable(getResources().getDrawable(R.drawable.perronormal));
                        break;
                    case R.id.rbHorroroso:
                        imagen.setImageDrawable(getResources().getDrawable(R.drawable.perrohorroroso));
                        break;
                }
            }
        });
    }

    public void enviar (View View){
        String str="";
        switch (View.getId()){
            case R.id.btnenviar:
               if (rbHermoso.isChecked()==true){
                   str="Hermoso";
                   Intent enviar = new Intent(MainActivity.this,MainActivity2.class);
                   Bundle miBundle = new Bundle();
                   miBundle.putString("nombre", str);
                   enviar.putExtras(miBundle);
                   startActivity(enviar);
               } else if (rbLindo.isChecked()==true) {
                   str="Lindo";
                   Intent enviar = new Intent(MainActivity.this,MainActivity2.class);
                   Bundle miBundle = new Bundle();
                   miBundle.putString("nombre", str);
                   enviar.putExtras(miBundle);
                   startActivity(enviar);
               } else if (rbNormal.isChecked()==true) {
                   str="Normal";
                   Intent enviar = new Intent(MainActivity.this,MainActivity2.class);
                   Bundle miBundle = new Bundle();
                   miBundle.putString("nombre", str);
                   enviar.putExtras(miBundle);
                   startActivity(enviar);
               } else if (rbHorroroso.isChecked()==true) {
                   str="Horroroso";
                   Intent enviar = new Intent(MainActivity.this,MainActivity2.class);
                   Bundle miBundle = new Bundle();
                   miBundle.putString("nombre", str);
                   enviar.putExtras(miBundle);
                   startActivity(enviar);
               }

        }

    }

    public void salir(View S){
        finishAffinity();
    }
}