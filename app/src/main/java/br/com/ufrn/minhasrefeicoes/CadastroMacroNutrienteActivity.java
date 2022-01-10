package br.com.ufrn.minhasrefeicoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class CadastroMacroNutrienteActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_macro_nutriente);

        spinner = (Spinner) findViewById(R.id.macro_nutrientes_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.macro_nutrientes_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

        final Button button = findViewById(R.id.cadastrar_macro_nutriente_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                obterCadastroMacroNutriente();
            }
        });
    }

    private void obterCadastroMacroNutriente() {
        String tipoMacroNutriente = spinner.getSelectedItem().toString();

        EditText edit = (EditText)findViewById(R.id.alimento_editTextTextMultiLine);
        String descricaoAlimento = edit.getText().toString();

        TextInputEditText textInputEditText = findViewById(R.id.peso_textInputEditText);
        String pesoEmGramas = textInputEditText.getText().toString();

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, "teste: " + tipoMacroNutriente + " " + descricaoAlimento + " " + pesoEmGramas , duration);
        toast.show();
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}