package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacao extends AppCompatActivity {

    EditText nmr1, nmr2;
    TextView result;
    Button btnMult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacao);


        nmr1 = findViewById(R.id.nmr1);
        nmr2 = findViewById(R.id.nmr2);

        result = findViewById(R.id.resultado);

        btnMult = findViewById(R.id.btnMult);

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strNmr1 = nmr1.getText().toString();
                String strNmr2 = nmr2.getText().toString();

                float num1 = Float.parseFloat(strNmr1);
                float num2 = Float.parseFloat(strNmr2);

                float mult = num1 * num2;

                String resultado = String.valueOf(mult);

                result.setText(resultado);

            }
        });
    }
}