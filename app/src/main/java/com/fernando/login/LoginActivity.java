package com.fernando.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fernando on 28/09/2016.
 */

public class LoginActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPass;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = (EditText) findViewById(R.id.edit_text_username);
        editTextPass = (EditText) findViewById(R.id.edit_text_contrasenia);

    }

    public void onClickLogin(View view) {
        Log.i("Evento", "Click en el botón login");

        if (editTextUsername.getText().toString().equals("admin")
                && editTextPass.getText().toString().equals("admin")) {

            Intent i = new Intent(this, MainActivity.class);
            i.putExtra(Constantes.EXTRA_USERNAME, editTextUsername.getText().toString());
            i.putExtra(Constantes.EXTRA_PASS, editTextPass.getText().toString());
            startActivity(i);

        } else {

            Toast.makeText(getApplicationContext(), "Usuario incorrecto", Toast.LENGTH_SHORT).show();
        }

    }
}
