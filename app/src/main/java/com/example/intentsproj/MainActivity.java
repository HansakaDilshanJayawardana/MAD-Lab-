package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etN1, etN2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclickButton();
    }

    public void onclickButton() {
        button = (Button)findViewById(R.id.okbtn);
        button.setOnClickListener (
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        etN1 = findViewById(R.id.inboxNumber01);
                        etN2 = findViewById(R.id.inboxNumber02);
                        String n1 = etN1.getText().toString();
                        String n2 = etN2.getText().toString();
                        intent.putExtra("EXTRA_MESSAGE1", n1);
                        intent.putExtra("EXTRA_MESSAGE2", n2);
                        startActivity(intent);

                        Toast.makeText(getApplicationContext(), "You just clicked the OK button", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}