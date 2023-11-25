package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Text1;
    private EditText Text2;
    private TextView Text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text1 = findViewById(R.id.Text1);
        Text2 = findViewById(R.id.Text2);
        Text3 = findViewById(R.id.Text3);

        Button buttonSl = findViewById(R.id.buttonSl);
        Button buttonVh = findViewById(R.id.buttonVh);
        Button buttonUm = findViewById(R.id.buttonUm);
        Button buttonDl = findViewById(R.id.buttonDl);

        buttonSl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(Text1.getText().toString());
                float num2 = Float.parseFloat(Text2.getText().toString());
                float num3 = num1 + num2;
                Text3.setText(String.valueOf(num3));
            }
        });

        buttonVh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(Text1.getText().toString());
                float num2 = Float.parseFloat(Text2.getText().toString());
                float num3 = num1 - num2;
                Text3.setText(String.valueOf(num3));
            }
        });

        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(Text1.getText().toString());
                float num2 = Float.parseFloat(Text2.getText().toString());
                float num3 = num1 * num2;
                Text3.setText(String.valueOf(num3));
            }
        });

        buttonDl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(Text1.getText().toString());
                float num2 = Float.parseFloat(Text2.getText().toString());
                float num3 = num1 / num2;
                Text3.setText(String.valueOf(num3));
            }
        });
    }
}
