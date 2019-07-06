package com.example.estudiante.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Principal extends AppCompatActivity {
    TextView resultado;
    EditText num1,num2;
    double n1, n2, suma;
    String opciones[];
    Spinner combo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        num1 = findViewById(R.id.txtNumeroUno);
        num2 = findViewById(R.id.txtNumeroDos);
        resultado = findViewById(R.id.txtResultado);
        combo = findViewById(R.id.cmbOperacion);
        opciones = getResources().getStringArray(R.array.operaciones);
        //Creamos el adapter indicando, donde se va a colocar como se va a visualizar y que se va a mostrar
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,opciones);

        //pasamos el adaptador al combo
        combo.setAdapter(adapter);

    }

    public void calcular(View v){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        suma = n1 + n2;
        resultado.setText(""+suma);


    }
}
