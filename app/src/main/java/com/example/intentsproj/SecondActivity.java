package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvDis;
    EditText etN1, etN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent newIntent = getIntent();
        String n1 = newIntent.getStringExtra("EXTRA_MESSAGE1");
        String n2 = newIntent.getStringExtra("EXTRA_MESSAGE2");
        etN1 = findViewById(R.id.inboxNumber01);
        etN2 = findViewById(R.id.inboxNumber02);
        etN1.setText(n1);
        etN2.setText(n2);
    }

    public void Add(View view) {
        tvDis = findViewById(R.id.lplSum);
        int no1 = Integer.parseInt(etN1.getText().toString());
        int no2 = Integer.parseInt(etN2.getText().toString());
        int tot = no1 + no2;

        tvDis.setText(etN1.getText().toString() + " + " + etN2.getText().toString() + " = " + String.valueOf(tot));
    }

    public  void  Min(View view) {
        tvDis = findViewById(R.id.lplSum);
        int no1 = Integer.parseInt(etN1.getText().toString());
        int no2 = Integer.parseInt(etN2.getText().toString());
        int tot = no1 - no2;

        tvDis.setText(etN1.getText().toString() + " - " + etN2.getText().toString() + " = " + String.valueOf(tot));
    }

    public void Mul(View view) {
        tvDis = findViewById(R.id.lplSum);
        int no1 = Integer.parseInt(etN1.getText().toString());
        int no2 = Integer.parseInt(etN2.getText().toString());
        int tot = no1 * no2;

        tvDis.setText(etN1.getText().toString() +  " * " + etN2.getText().toString() + " = " + String.valueOf(tot));
    }

    public  void  Div(View view) {
        tvDis = findViewById(R.id.lplSum);
        int no1 = Integer.parseInt(etN1.getText().toString());
        int no2 = Integer.parseInt(etN2.getText().toString());
        int tot = no1 / no2;

        tvDis.setText(etN1.getText().toString() + " / " + etN2.getText().toString() + " = " + String.valueOf(tot));
    }
}