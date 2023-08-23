package com.example.mysecond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAcceso(View view){
        Intent intent= new Intent(this,Acceso.class);
        startActivity(intent);
    }

    public void onClickVolver(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}