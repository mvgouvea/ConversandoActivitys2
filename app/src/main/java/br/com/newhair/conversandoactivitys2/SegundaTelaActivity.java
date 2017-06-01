package br.com.newhair.conversandoactivitys2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaTelaActivity extends AppCompatActivity {

    private TextView nome;
    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);


         nome = (TextView) findViewById(R.id.txtNome);
         email = (TextView) findViewById(R.id.txtEmail);


        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String nomeRecuperado = bundle.getString("NOME");
        String emailRecuperado = bundle.getString("EMAIL");

        nome.setText(nomeRecuperado);
        email.setText(emailRecuperado);


    }
}
