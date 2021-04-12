package com.example.tp1_tatianaialtanskaia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button evaluarPalindromo, convertirTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evaluarPalindromo = findViewById(R.id.btnEvaluatePal);
        convertirTemp = findViewById(R.id.btnConvertTemp);

        evaluarPalindromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this, EvaluarPalindromo.class);
                startActivity(intento);

            }
        });

        convertirTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this, ConvertirTemperatura.class);
                startActivity(intento);

            }
        });

    }
}