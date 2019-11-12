package com.example.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcoolId);
        precoGasolina = findViewById(R.id.precoGasolinaId);
        botaoVerificar = findViewById(R.id.botaoVerificarId);
        textoResultado = findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double textoPrecoAlcool = Double.parseDouble(precoAlcool.getText().toString());
                double textoPrecoGasolina = Double.parseDouble(precoGasolina.getText().toString());

                double resultado = textoPrecoAlcool / textoPrecoGasolina;

                if (resultado >= 0.7) textoResultado.setText("Usar gasolina");
                else textoResultado.setText("Usar alcool");

            }
        });

    }
}
