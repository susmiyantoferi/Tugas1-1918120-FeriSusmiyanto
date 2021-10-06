package com.example.intentpraktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    EditText alas, tinggi;
    Button btnhitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = (EditText) findViewById(R.id.EditAlas);
        tinggi = (EditText) findViewById(R.id.EditTinggi);
        hasil = (TextView) findViewById(R.id.Hasil);
        btnhitung = (Button) findViewById(R.id.buttonSgt);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double data1, data2, result;

                data1 = Double.valueOf(alas.getText().toString().trim());
                data2 = Double.valueOf(tinggi.getText().toString().trim());

                result = 0.5 * data1 * data2;
                String resulting = String.valueOf(result);
                hasil.setText(resulting);
            }
        });



    }


}