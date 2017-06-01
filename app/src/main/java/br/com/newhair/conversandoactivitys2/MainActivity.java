package br.com.newhair.conversandoactivitys2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtEmail;
    private Button btnEnviar;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtEmail = (EditText) findViewById(R.id.edtNome);
        btnEnviar = (Button) findViewById(R.id.btnProxima);


        //Botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtNome.getText().toString();
                String email = edtEmail.getText().toString();

                Bundle bundle = new Bundle();

                bundle.putString("NOME", nome);
                bundle.putString("EMAIL", email);

                Intent intent = new Intent(MainActivity.this, SegundaTelaActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });




    }
}
