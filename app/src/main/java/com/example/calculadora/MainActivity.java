package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSoma,btnMultiplicacao, btnDivisao, btnSubtracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSubtracao = (Button) findViewById(R.id.btnSubtracao);
        btnDivisao = (Button) findViewById(R.id.btnDivisao);
        btnMultiplicacao = (Button) findViewById(R.id.btnMultiplicacao);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, Soma.class);

                startActivity(it);

            }
        });
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, Subtracao.class);

                startActivity(it);

            }
        });
        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, Divisao.class);

                startActivity(it);

            }
        });
        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, Multiplicacao.class);

                startActivity(it);

            }
        });

    }
}