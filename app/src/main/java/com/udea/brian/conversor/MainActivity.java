package com.udea.brian.conversor;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numeroDecimal;
    EditText numeroRomano;
    Button convertir;

    String numRomano;
    int numDecimal;

    Conversor conversor =  new Conversor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroDecimal = (TextView) findViewById(R.id.numero_decimal);
        numeroRomano = (EditText) findViewById(R.id.numero_romano);
        convertir = (Button) findViewById(R.id.convertir);

        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(numeroRomano.getWindowToken(), 0);

                numRomano = numeroRomano.getText().toString();
                numDecimal = conversor.convertirRomanoADecimal(numRomano);
                numeroDecimal.setText(numDecimal+"");
            }
        });
    }
}
