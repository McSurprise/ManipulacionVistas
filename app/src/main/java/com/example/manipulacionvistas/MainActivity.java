package com.example.manipulacionvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        mostrarResultado();
    }

    public void incrementar(View view) {
        contador++;
        mostrarResultado();
    }

    public void disminuir(View view) {
        contador--;
        mostrarResultado();
    }

    public void resetear(View view) {
        contador = 0;
        mostrarResultado();
    }

    private void mostrarResultado() {
        TextView textresultado = (TextView)findViewById(R.id.textView2);
        textresultado.setText("Contador:"+contador);
    }

}