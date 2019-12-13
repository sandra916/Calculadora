package com.sandra.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvdisplay;
    double numero1, numero2, res;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bCero(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "0");

    }

    public void bUno(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "1");

    }

    public void bDos(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "2");

    }

    public void bTres(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "3");

    }

    public void bCuatro(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "4");

    }

    public void bCinco(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "5");

    }

    public void bSeis(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "6");

    }

    public void bSiete(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "7");

    }

    public void bOcho(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "8");

    }

    public void bNueve(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + "9");

    }

    public void bPunto(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText() + ".");

    }

    public void OnClickOperacionCapturaNumero1(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        numero1 = Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }

    public void Sumar(View view) {
        Operador = "+";
        OnClickOperacionCapturaNumero1(view);

    }

    public void Restar(View view) {
        Operador = "-";
        OnClickOperacionCapturaNumero1(view);

    }

    public void Multiplicar(View view) {
        Operador = "*";
        OnClickOperacionCapturaNumero1(view);

    }

    public void Dividir(View view) {
        Operador = "/";
        OnClickOperacionCapturaNumero1(view);

    }

    public void Exponiente(View view) {
        Operador = "exp";
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try {

            numero1 = Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");
        } catch (NumberFormatException nfe) {
        }
    }

    public void bIgual(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        numero2 = Double.parseDouble(tvdisplay.getText().toString());
        if (Operador.equals("+")) {
            res = numero1 + numero2;
        } else if (Operador.equals("-")) {
            res = numero1 - numero2;
        } else if (Operador.equals("*")) {
            res = numero1 * numero2;
        } else if (Operador.equals("/")) {
            res = numero1 / numero2;
        } else if (Operador.equals("exp")) {
            tvdisplay = (TextView) findViewById(R.id.tv_dis);
            numero2 = Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText(" ");
            res = Math.pow(numero1, numero2);
        }
        tvdisplay.setText("" + res);
    }

    public void Rnd(View view) {
        for (int x = 0; x <= 100; x++) {
            int na = (int) Math.floor(Math.random() * (100 - (1 + 1) + (1)));
            tvdisplay.setText(String.valueOf(na));
        }
    }

    public void Raiz(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try {
            numero1 = Double.parseDouble(tvdisplay.getText().toString());
            res = Math.sqrt(numero1);
            tvdisplay.setText(String.valueOf(res));

        } catch (NumberFormatException nfe) {
        }

    }

    public void ExpCuadrada(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try {
            numero1 = Double.parseDouble(tvdisplay.getText().toString());
            res = Math.pow(numero1, 2);
            tvdisplay.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {}

    }

    public void ExpCubico(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try {
            numero1 = Double.parseDouble(tvdisplay.getText().toString());
            res = Math.pow(numero1, 3);
            tvdisplay.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {}

    }
     public void Sen(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try {
            numero1 = Double.parseDouble(tvdisplay.getText().toString());
            Double rd = Math.toRadians(numero1);
            res = Math.sin(rd);
            tvdisplay.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {}

    }

    public void Cos(View view){
            tvdisplay = (TextView) findViewById(R.id.tv_dis);
            try {
                numero1 = Double.parseDouble(tvdisplay.getText().toString());
                Double rd = Math.toRadians(numero1);
                res = Math.cos(rd);
                tvdisplay.setText(String.valueOf(res));
            } catch (NumberFormatException nfe) {}

        }
    public void Tan (View view){
            tvdisplay = (TextView) findViewById(R.id.tv_dis);
            try {
                numero1 = Double.parseDouble(tvdisplay.getText().toString());
                Double rd = Math.toRadians(numero1);
                res = Math.tan(rd);
                tvdisplay.setText(String.valueOf(res));
            } catch (NumberFormatException nfe) {}
        }
    public void Factorial (View view){
        int fact=1;
        int x;
        try {
                for (x=1; x<=numero1; x++){
                    fact=fact * x;

                }
                 tvdisplay.setText(String.valueOf(res));

        }catch (NumberFormatException nfe){}
    }
    public void BorrarUlt (View view){
        if (tvdisplay.getText().toString().equals(" ")){
            tvdisplay.setText(tvdisplay.getText().subSequence(0,tvdisplay.getText().length()-1)+" ");
        }
    }
    public void BorrarTodo (View view){
        numero1=0.0;
        numero2=0.0;
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(" ");
    }
    public void Salir(View view){
        finish();
    }
}
