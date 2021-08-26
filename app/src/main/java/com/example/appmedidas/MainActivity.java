package com.example.appmedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputName, inputAge, inputHeight, inputWeight;
    Button calculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.edTxtName);
        inputAge = findViewById(R.id.edTxtNumberAge);
        inputHeight = findViewById(R.id.edTxtNumberHeight);
        inputWeight = findViewById(R.id.edTxtNumberWeight);
        calculateBtn = findViewById(R.id.buttonCalculate);

    }
}