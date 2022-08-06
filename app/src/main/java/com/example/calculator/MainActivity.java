package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  Button b1,b2,b3,b4,b9,b5,b6,b7,b8,b10,add,sub,multiply,div,clear,ans;
  EditText e1;
    double result=0.0;
  boolean num=true;
  String op="";
  String firstno="";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        e1=findViewById(R.id.e1);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        multiply=findViewById(R.id.multiply);
        div=findViewById(R.id.div);
        clear=findViewById(R.id.clear);
        ans=findViewById(R.id.ans);
        e1=findViewById(R.id.e1);



    }

    public void value(View view)
    {
        if(num)
            e1.setText("");
        num=false;
        String no=e1.getText().toString();
        switch(view.getId())
        {
            case R.id.b1:
                no +="1";
                break;
            case R.id.b2:
                no +="2";
                break;
            case R.id.b3:
                no +="3";
                break;
            case R.id.b4:
                no +="4";
                break;
            case R.id.b5:
                no +="5";
                break;
            case R.id.b6:
                no +="6";
                break;
            case R.id.b7:
                no +="7";
                break;
            case R.id.b8:
                no +="8";
                break;
            case R.id.b9:
                no +="9";
                break;
            case R.id.b10:
                no +="0";
                break;

        }
        e1.setText(no);
    }

    public void Operator(View view)
    {
     num=true;
     firstno=e1.getText().toString();
     switch(view.getId())
     {
         case R.id.add:
             op="+";
             break;
         case R.id.sub:
             op="-";

             break;
         case R.id.multiply:
             op="*";
             break;
         case R.id.div:
             op="/";
             break;

     }

    }

    public void Answer(View view)
    {
        String secondno=e1.getText().toString();

        switch(op)
        {
            case "+":
                result=Double.parseDouble(firstno) +Double.parseDouble(secondno);
                break;
            case "-":
                result=Double.parseDouble(firstno) - Double.parseDouble(secondno);
                break;
            case "*":
                result=Double.parseDouble(firstno) * Double.parseDouble(secondno);
                break;
            case "/":
                result=Double.parseDouble(firstno) / Double.parseDouble(secondno);
                break;
        }
        e1.setText(""+result);
        }

    public void Clear(View view)
    {
        e1.setText("");
    }
}
