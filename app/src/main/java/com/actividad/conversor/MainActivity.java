package com.actividad.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText etCajaNumero, etBinario, etOctal, etHexadecimal;
     RadioButton rbDecimal, rbOctal, rbBinario,rbHexa;
     CheckBox ckBinario, ckOctal, ckHexadecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    rbDecimal = findViewById(R.id.rbDecimal);
        rbOctal = findViewById(R.id.rbOctal);
        rbBinario = findViewById(R.id.rbBinario);
        rbHexa = findViewById(R.id.rbHexa);

    ckBinario = findViewById(R.id.ckBinario);
        ckOctal = findViewById(R.id.ckOctal);
        ckHexadecimal = findViewById(R.id.ckHexadecimal);


    etCajaNumero = findViewById(R.id.etCajaNumero);
        etBinario = findViewById(R.id.etBinario);
        etOctal = findViewById(R.id.etOctal);
        etHexadecimal = findViewById(R.id.etHexadecimal);

    }

    public void binario(View v){
        if(ckBinario.isChecked()) {

            if (rbDecimal.isChecked()) {
                String resBinario = Integer.toBinaryString(Integer.parseInt(etCajaNumero.getText().toString()));
                etBinario.setText(resBinario);
            } else if (rbOctal.isChecked()) {
                int numD = Integer.parseInt(etCajaNumero.getText().toString(),8);
                String resBinario = Integer.toBinaryString(numD);
                etBinario.setText(resBinario);
            } else if (rbBinario.isChecked()) {
                etBinario.setText(etCajaNumero.getText().toString());
            } else if (rbHexa.isChecked()) {
                int numD = Integer.parseInt(etCajaNumero.getText().toString(),16);
                String resBinario = Integer.toBinaryString(numD);
                etBinario.setText(resBinario);
            }
        }else{
            etBinario.setText("");
        }
    };

    public void octal(View v){
        if(ckOctal.isChecked()) {

            if (rbDecimal.isChecked()) {
                String resOctal = Integer.toOctalString(Integer.parseInt(etCajaNumero.getText().toString()));
                etOctal.setText(resOctal);
            } else if (rbOctal.isChecked()) {
                etOctal.setText(etCajaNumero.getText().toString());
            } else if (rbBinario.isChecked()) {
                int decimal=Integer.parseInt(etCajaNumero.getText().toString(),2);
                String resOctal = Integer.toOctalString(decimal);
                etOctal.setText(resOctal);
            } else if (rbHexa.isChecked()) {
                int numD = Integer.parseInt(etCajaNumero.getText().toString(),16);
                String resOctal = Integer.toOctalString(numD);
                etOctal.setText(resOctal);
            }
        }else{
            etOctal.setText("");
        }


    };

    public void hexadecimal(View v){
        if(ckHexadecimal.isChecked()) {

            if (rbDecimal.isChecked()) {
                String resHexa = Integer.toHexString(Integer.parseInt(etCajaNumero.getText().toString()));
                etHexadecimal.setText(resHexa);
            } else if (rbOctal.isChecked()) {
                int decimal=Integer.parseInt(etCajaNumero.getText().toString(),8);
                String resHexa = Integer.toHexString(decimal);
                etHexadecimal.setText(resHexa);
            } else if (rbBinario.isChecked()) {
                int decimal=Integer.parseInt(etCajaNumero.getText().toString(),2);
                String resHexa = Integer.toHexString(decimal);
                etHexadecimal.setText(resHexa);
            } else if (rbHexa.isChecked()) {
                etHexadecimal.setText(etCajaNumero.getText().toString());
            }
        }else{
            etHexadecimal.setText("");
        }

    };


}
