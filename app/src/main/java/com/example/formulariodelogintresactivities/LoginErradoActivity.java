package com.example.formulariodelogintresactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginErradoActivity extends AppCompatActivity {

    Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_errado);

       btn_voltar = (Button) findViewById(R.id.button2);

        Toast.makeText(this, "Login Errado!", Toast.LENGTH_SHORT).show();

       btn_voltar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent voltar = new Intent(LoginErradoActivity.this, MainActivity.class);
               startActivity(voltar);
           }
       });
    }
}