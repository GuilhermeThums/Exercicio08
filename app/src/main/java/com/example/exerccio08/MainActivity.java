package com.example.exerccio08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSend(View view){
        Context context = getApplicationContext();
        int duracao = Toast.LENGTH_SHORT;

        EditText nome = findViewById(R.id.nome);
        String nomeText = nome.getText().toString();

        EditText sobrenome = findViewById(R.id.sobrenome);
        String sobrenomeText = sobrenome.getText().toString();

        EditText idade = findViewById(R.id.idade);
        String idadeText = idade.getText().toString();

        EditText sexo = findViewById(R.id.sexo);
        String sexoText = sexo.getText().toString();

        if(TextUtils.isEmpty(nomeText)){
            Toast toast = Toast.makeText(context, "Campo 'nome' vazio!", duracao);
            toast.show();
        } else if(TextUtils.isEmpty(sobrenomeText)){
            Toast toast = Toast.makeText(context, "Campo 'sobrenome' vazio!", duracao);
            toast.show();
        } else if(TextUtils.isEmpty(idadeText)){
            Toast toast = Toast.makeText(context, "Campo 'idade' vazio!", duracao);
            toast.show();
        } else if(TextUtils.isEmpty(sexoText)){
            Toast toast = Toast.makeText(context, "Campo 'sexo' vazio!", duracao);
            toast.show();
        } else{
            Toast toast = Toast.makeText(context, "Tudo ok!", duracao);
            toast.show();
        }

    }
}
