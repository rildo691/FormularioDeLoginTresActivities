package com.example.formulariodelogintresactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginOkActivity extends AppCompatActivity {

    TextView txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ok);

        txt_resultado = (TextView) findViewById(R.id.textView5);
        Intent it = getIntent();

        String informacao = it.getStringExtra("Username");
        txt_resultado.setText("Seja Bem-Vindo " + informacao);
    }
}