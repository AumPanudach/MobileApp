package com.example.calculatenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText NumberOne,NumberTwo,ResultNumber,Maxnumber,MinNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ResultNumber = findViewById(R.id.ResultNumber);
        Maxnumber =  findViewById(R.id.Maxnumber);
        MinNumber =  findViewById(R.id.Mimnuber);
        NumberOne =  findViewById(R.id.NumberOne);
        NumberTwo =  findViewById(R.id.NumberTwo);
        button =   findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String input1,input2;
                Double num1,num2;
                input1 = NumberOne.getText().toString().trim();
                input2 = NumberTwo.getText().toString().trim();
                if (input1.isEmpty() || input2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter your number",Toast.LENGTH_LONG).show();
                    NumberOne.setText("");
                    NumberTwo.setText("");
                    ResultNumber.setText("");
                    MinNumber.setText("");
                    Maxnumber.setText("");
                }else {
                    num1 = Double.parseDouble(input1);
                    num2 = Double.parseDouble(input2);
                    ResultNumber.setText(String.format("%.2f",findSum(num1,num2)));
                    Maxnumber.setText(String.format("%.2f",findMax(num1,num2)));
                    MinNumber.setText(String.format("%.2f",findMin(num1,num2)));
                }
            }
        });
    }
    private Double findSum(Double num1 , Double num2){

        return  num1 + num2;
    }

    private  Double findMax(Double num1 , Double num2){

        return Math.max(num1,num2);
    }

    private  Double findMin(Double num1 , Double num2){

        return Math.min(num1,num2);
    }
}