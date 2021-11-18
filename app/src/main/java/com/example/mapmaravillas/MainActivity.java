package com.example.mapmaravillas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTuristicos, btnMantiguas,btnMmodernas, btnRuta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTuristicos = (Button) findViewById(R.id.btnTuristicos);
        btnMantiguas = (Button) findViewById(R.id.btnAntiguas);
        btnMmodernas = (Button) findViewById(R.id.btnModernas);
        btnRuta = (Button) findViewById(R.id.btnRutas);

        btnTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Turistico.class);
                startActivity(intent);
            }
        });

        btnMantiguas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Mantiguo.class);
                startActivity(intent);
            }
        });

        btnMmodernas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Mmoderno.class);
                startActivity(intent);
            }
        });

     /*   btnRuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Rutas.class);
                startActivity(intent);
            }
        });*/

    }
}