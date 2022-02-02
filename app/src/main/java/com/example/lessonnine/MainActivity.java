package com.example.lessonnine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

     void initViews() {
         Button button_main=findViewById(R.id.button_main);
         button_main.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openAnimationPage();
             }
         });
    }
    void openAnimationPage(){
        Intent intent=new Intent(this,AnimationActivity.class);
        startActivity(intent);
    }
}