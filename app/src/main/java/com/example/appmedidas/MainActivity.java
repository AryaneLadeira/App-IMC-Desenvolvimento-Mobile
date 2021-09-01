package com.example.appmedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appmedidas.model.Pessoa;

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

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = inputName.getText().toString();
                double weight = Double.valueOf(inputWeight.getText().toString());
                double height = Double.valueOf(inputHeight.getText().toString());
                int age = Integer.valueOf(inputAge.getText().toString());

                Pessoa pessoa = new Pessoa(name, weight , height, age);
                Toast.makeText(getApplicationContext(), "Olá "+name+" , "+age+" anos, "+weight+" kg e "+height+" de altura."+"\n Seu IMC é: "
                        +String.format("%.2f",pessoa.imc())+" - "+pessoa.resultado(), Toast.LENGTH_LONG).show();

                cleanField(inputName, inputAge, inputHeight, inputWeight);
                inputName.requestFocus();
            }
        });
    }

    public void cleanField(EditText ... campos){
        for(EditText et: campos){
            et.setText("");
        }
    }
}