package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Divisao extends AppCompatActivity {

    EditText nmr1, nmr2;
    TextView result;
    Button btnDividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisao);

        nmr1 = findViewById(R.id.nmr1);
        nmr2 = findViewById(R.id.nmr2);

        result = findViewById(R.id.resultado);

        btnDividir = findViewById(R.id.btndividir);

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strNmr1 = nmr1.getText().toString();
                String strNmr2 = nmr2.getText().toString();

                float num1 = Float.parseFloat(strNmr1);
                float num2 = Float.parseFloat(strNmr2);

                float divisao = num1 / num2;

                String resultado = String.valueOf(divisao);

                result.setText(resultado);

            }
        });



    }
}