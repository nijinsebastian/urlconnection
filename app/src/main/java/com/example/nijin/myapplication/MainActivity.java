package com.example.nijin.myapplication;


import android.content.Intent;
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
    public void nextPage(View myView){
        EditText in1=(EditText) findViewById(R.id.editText);
        EditText in2=(EditText) findViewById(R.id.editText2);
        Intent myintent=new Intent(this,Main2Activity.class);
        myintent.putExtra("LON",Double.parseDouble(in1.getText().toString()));
        myintent.putExtra("LAT",Double.parseDouble(in2.getText().toString()));
        startActivity(myintent);
    }
}
