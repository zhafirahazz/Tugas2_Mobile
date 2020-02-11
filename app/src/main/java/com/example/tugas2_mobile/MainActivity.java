package com.example.tugas2_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSin;
    private Button btnCos;
    private Button btnTan;
    private Button btnCsc;
    private Button btnSec;
    private Button btnCot;
    private Button btnLog;
    private EditText angka;
    private TextView tHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka = findViewById(R.id.angka);
        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnTan = findViewById(R.id.btnTan);
        btnCsc = findViewById(R.id.btnCsc);
        btnSec = findViewById(R.id.btnSec);
        btnCot = findViewById(R.id.btnCot);
        btnLog = findViewById(R.id.btnLog);
        tHasil = findViewById(R.id.tHasil);
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sAngka = angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double result = Math.sin(dAngka);

                    String sHasil = String.valueOf(result);
                    tHasil.setText(sHasil);
                } catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sAngka = angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double result = Math.cos(dAngka);

                    String sHasil = String.valueOf(result);
                    tHasil.setText(sHasil);
                } catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sAngka = angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double result = Math.tan(dAngka);

                    String sHasil = String.valueOf(result);
                    tHasil.setText(sHasil);
                } catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sAngka = angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double result = 1/Math.sin(dAngka);

                    String sHasil = String.valueOf(result);
                    tHasil.setText(sHasil);
                } catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sAngka = angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double result = 1/Math.cos(dAngka);

                    String sHasil = String.valueOf(result);
                    tHasil.setText(sHasil);
                } catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sAngka = angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double result = 1/Math.tan(dAngka);

                    String sHasil = String.valueOf(result);
                    tHasil.setText(sHasil);
                } catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sAngka = angka.getText().toString();

                    double dAngka = Double.parseDouble(sAngka);

                    double result = Math.log(dAngka);

                    String sHasil = String.valueOf(result);
                    tHasil.setText(sHasil);
                } catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
