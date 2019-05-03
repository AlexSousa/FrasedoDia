package com.example.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void gerarNovaFrase(View view){
        String[] frases = {
                "Hello world",
                "Meu Nome",
                "VEttelRodou",
                "MyHome",
                "Natana",
                "F1",
                "A",
                "b",
                "v",
                "c",
                "d",
                "e",
                "f",
        };
        int numero = new Random().nextInt(frases.length);
        TextView texto = findViewById(R.id.fraseaqui);
        texto.setText(frases[numero]);
    }
}
