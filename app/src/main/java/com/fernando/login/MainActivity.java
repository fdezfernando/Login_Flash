package com.fernando.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewUsuario, textViewPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewUsuario = (TextView) findViewById(R.id.text_username);
        textViewPass = (TextView) findViewById(R.id.text_contrasenia);

        Intent i = getIntent();
        Bundle parametros = i.getExtras();
        String usuario = parametros.getString(Constantes.EXTRA_USERNAME);
        String pass = parametros.getString(Constantes.EXTRA_PASS);


        textViewUsuario.setText(usuario);
        textViewPass.setText(pass);


    }
}

