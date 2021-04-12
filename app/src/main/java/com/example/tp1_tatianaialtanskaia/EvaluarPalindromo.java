package com.example.tp1_tatianaialtanskaia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EvaluarPalindromo extends AppCompatActivity {

    private EditText evaluateText;
    private Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluar_palindromo);

        evaluateText = (EditText)findViewById(R.id.insertText);
        atras = findViewById(R.id.btnBack);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(EvaluarPalindromo.this, MainActivity.class);
                startActivity(intento);

            }
        });
    }


    public void EvaluarPalabra(View view){

        boolean palindromo = true;
        char[] palabra = evaluateText.getText().toString().toCharArray();
        int lenghtPalabra = palabra.length;

        if (lenghtPalabra == 0){
            Toast.makeText(this, "Ingrese su texto", Toast.LENGTH_LONG).show();
        }
        if (lenghtPalabra != 0){
            for (int i = 0; i < lenghtPalabra/2; i++){
                if (palabra[i] != palabra[lenghtPalabra -1 -i]){
                    palindromo = false;
                    break;
                }
            }

            if (palindromo){
                Toast.makeText(this, "Es palindromo", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this, "NO es palindromo", Toast.LENGTH_LONG).show();
            }
        }

    }



}