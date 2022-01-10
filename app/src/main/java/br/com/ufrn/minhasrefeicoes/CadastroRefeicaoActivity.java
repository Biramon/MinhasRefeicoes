package br.com.ufrn.minhasrefeicoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CadastroRefeicaoActivity extends AppCompatActivity {

    private Spinner spTiposRefeicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_refeicao);

        spTiposRefeicao = (Spinner) findViewById(R.id.spTiposRefeicao);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tipos_refeicao, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTiposRefeicao.setAdapter(adapter);
    }
}