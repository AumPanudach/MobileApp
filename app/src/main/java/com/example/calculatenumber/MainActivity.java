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
        ResultNumber = (EditText) findViewById(R.id.ResultNumber);
        Maxnumber = (EditText) findViewById(R.id.Maxnumber);
        MinNumber = (EditText) findViewById(R.id.Mimnuber);
        NumberOne = (EditText) findViewById(R.id.NumberOne);
        NumberTwo = (EditText) findViewById(R.id.NumberTwo);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String input1,input2;
                Integer num1,num2;
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
                    num1 = Integer.parseInt(input1);
                    num2 = Integer.parseInt(input2);
                    ResultNumber.setText(findSum(num1,num2).toString());
                    Maxnumber.setText(findMax(num1,num2).toString());
                    MinNumber.setText(findMin(num1,num2).toString());
                }
            }
        });
    }
    private Integer findSum(int num1 , int num2){

        return  num1 + num2;
    }

    private  Integer findMax(int num1 , int num2){

        return Math.max(num1,num2);
    }

    private  Integer findMin(int num1 , int num2){

        return Math.min(num1,num2);
    }
}