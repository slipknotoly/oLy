package com.example.administrator.olyexchang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.olyexchang.fragement.MainFragement;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragement to Activity
        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainFragement,new MainFragement())
                    .commit();
        }


    }// Main Method
}//MainActivity Class
