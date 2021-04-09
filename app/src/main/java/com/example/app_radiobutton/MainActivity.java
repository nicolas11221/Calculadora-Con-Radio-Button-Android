package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Aqui se juna la parle logica con la parte Grafica

        et1 = (EditText)findViewById(R.id.txt_Valor1);
        et2 = (EditText)findViewById(R.id.txt_Valor2);
        tv1 = (TextView)findViewById(R.id.txt_Resultado);
        rb1 = (RadioButton)findViewById(R.id.radioButton_Sumar);
        rb2 = (RadioButton)findViewById(R.id.radioButton_Restar);
        rb3 = (RadioButton)findViewById(R.id.radioButton_Multiplicar);
        rb4 = (RadioButton)findViewById(R.id.radioButton_Division);
    }

    // Metodo para el boton Calcular
    public void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

    // Pasando Valores A INT
        int valor1_Int = Integer.parseInt(valor1_String);
        int valor2_Int = Integer.parseInt(valor2_String);

        // Es Verdad Que El Radio Button 1 Esta Seleccionado?
        // Si Es Asi, Ejecuta La Siguiente Linea De Codigo...

        // Pasar a String Para Mostrar En El TextView De Resultado
        // Con ayuda del String.valueOf se pasa de String a Int



        if (rb1.isChecked() == true){
            int suma = valor1_Int + valor2_Int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);

        } else if(rb2.isChecked() == true){
            int resta = valor1_Int - valor2_Int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);

        } else if(rb3.isChecked() == true){
            int multiplicar = valor1_Int * valor2_Int;
            String resultado = String.valueOf(multiplicar);
            tv1.setText(resultado);

        } else if(rb4.isChecked() == true){
            int division = valor1_Int / valor2_Int;
            String resultado = String.valueOf(division);
            tv1.setText(resultado);
        }

    }
}