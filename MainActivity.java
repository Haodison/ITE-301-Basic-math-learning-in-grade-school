package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View v){
        EditText et1 = (EditText)findViewById(R.id.edi1);
        EditText et2 = (EditText)findViewById(R.id.edi2);
        EditText et3 = (EditText)findViewById(R.id.edi3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1+n2;

        et3.setText("Answer: "+ result);
    }

    public void Divide(View v){
        EditText et1 = (EditText)findViewById(R.id.edi4);
        EditText et2 = (EditText)findViewById(R.id.edi5);
        EditText et3 = (EditText)findViewById(R.id.edi6);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1/n2;

        et3.setText("Answer: "+ result);
    }

    public void Subtract(View v){
        EditText et1 = (EditText)findViewById(R.id.edi7);
        EditText et2 = (EditText)findViewById(R.id.edi8);
        EditText et3 = (EditText)findViewById(R.id.edi9);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1-n2;

        et3.setText("Answer: "+ result);
    }

    public void Multi(View v){
        EditText et1 = (EditText)findViewById(R.id.edi10);
        EditText et2 = (EditText)findViewById(R.id.edi11);
        EditText et3 = (EditText)findViewById(R.id.edi12);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1*n2;

        et3.setText("Answer: "+ result);
    }

}