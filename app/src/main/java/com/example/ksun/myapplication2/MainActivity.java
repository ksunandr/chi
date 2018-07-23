package com.example.ksun.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    private Button cat1;
    private Button cat2;
    private Button cat3;
    private Button cat4;
    private ImageButton cat0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cat0 = findViewById(R.id.imageButton);

        cat0.setImageResource(R.drawable.chi0);
    }



    public void onClick1(View view){
        cat0.setImageResource(R.drawable.chi1);
    }
    public void onClick2(View view){
        cat0.setImageResource(R.drawable.chi2);
    }
    public void onClick3(View view){
        cat0.setImageResource(R.drawable.chi3);
    }
    public void onClick4(View view){
        cat0.setImageResource(R.drawable.chi4);
    }

}
