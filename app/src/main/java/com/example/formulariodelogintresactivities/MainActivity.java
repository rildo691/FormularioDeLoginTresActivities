package com.example.formulariodelogintresactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_username;
    EditText et_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = (EditText) findViewById(R.id.editTextTextPersonName);
        et_password = (EditText) findViewById(R.id.editTextTextPersonName2);
        btn_login = (Button) findViewById(R.id.button);

        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String username = et_username.getText().toString(), password = et_password.getText().toString();

                if (username.equals("user") && password.equals("pass")){
                    Intent it = new Intent(getApplicationContext(), LoginOkActivity.class);
                    it.putExtra("Username", et_username.getText().toString());
                    startActivity(it);
                } else {
                    Intent i = new Intent(MainActivity.this, LoginErradoActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}