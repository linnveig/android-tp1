package com.example.tp1_tatianaialtanskaia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConvertirTemperatura extends AppCompatActivity {

    private Button butCelAFahr, butFahrACel, atras;
    private TextView resultado;
    private EditText ingresarTemp;
    double resultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertir_temperatura);

        butCelAFahr = findViewById(R.id.butCelAFahr);
        butFahrACel = findViewById(R.id.butFahrACel);
        resultado = findViewById(R.id.result);
        ingresarTemp = findViewById(R.id.enterTemp);
        atras = findViewById(R.id.btnBackTemp);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(ConvertirTemperatura.this, MainActivity.class);
                startActivity(intento);

            }
        });

        butCelAFahr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double temp = Double.parseDouble(ingresarTemp.getText().toString());
                resultado1 = (temp*1.8) + 32;
                resultado.setText(String.valueOf(resultado1));

            }
        });

        butFahrACel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double temp = Double.parseDouble(ingresarTemp.getText().toString());
                resultado1 = (temp - 32)/1.8;
                resultado.setText(String.valueOf(resultado1));

            }
        });

    }


}