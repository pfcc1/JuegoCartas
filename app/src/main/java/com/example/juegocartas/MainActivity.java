package com.example.juegocartas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumeroJugadores,editTextNumeroCartas;
    Button buttonEmpezar;
    public static final String NUMEROCARTAS="NUMEROCARTAS";
    public static final String NUMEROJUGADORES="NUMEROJUGADORES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumeroCartas=findViewById(R.id.editTextNumeroCartas);
        editTextNumeroJugadores=findViewById(R.id.editTextNumerosJugadores);
        buttonEmpezar=findViewById(R.id.buttonEmpezar);

        buttonEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,activity_cartas.class);
                intent.putExtra(NUMEROCARTAS,editTextNumeroCartas.getText().toString());
                intent.putExtra(NUMEROJUGADORES,editTextNumeroJugadores.getText().toString());

                startActivity(intent);

            }
        });
    }
}