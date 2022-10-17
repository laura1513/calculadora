package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView res = (TextView) findViewById(R.id.resultado);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resultado(View view) {
        res.setText(calcular(res.getText().toString()));
    }

    public void uno(View view) {
        res.setText(res.getText());
    }
    public void dos(View view) {
        res.setText(res.getText());
    }
    public void tres(View view) {
        res.setText(res.getText());
    }
    public void cuatro(View view) {
        res.setText(res.getText());
    }
    public void cinco(View view) {
        res.setText(res.getText());
    }
    public void seis(View view) {
        res.setText(res.getText());
    }
    public void siete(View view) {
        res.setText(res.getText());
    }
    public void ocho(View view) {
        res.setText(res.getText());
    }
    public void nueve(View view) {
        res.setText(res.getText());
    }
    public void cero(View view) {
        res.setText(res.getText());
    }
    public String calcular(String cadena) {

        return cadena;
    }
}