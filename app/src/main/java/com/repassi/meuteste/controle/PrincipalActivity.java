package com.repassi.meuteste.controle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.repassi.meuteste.R;

public class PrincipalActivity extends AppCompatActivity {

    TextView txtNome;
    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtNome = (TextView) findViewById(R.id.txtPrincipalNome);
        txtEmail = (TextView) findViewById(R.id.txtPrincipalEmail);

        Intent it = getIntent();

        String email = it.getStringExtra("email");
        txtEmail.setText(email);
    }
}
