package com.example.expo_demo1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//Main Activity for Expo App
public class Menu_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //How Button1 works
        Button Sub1_Button = (Button) findViewById(R.id.button1);
        Sub1_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move to next Sub1Activity (Screen Transition)
                Intent move_main_sub1 = new Intent(Menu_Activity.this,Expo_Activity.class);
                startActivity(move_main_sub1);
            }
        });


        //How Maps Button works
        Button Sub2_Button = (Button) findViewById(R.id.button2);
        Sub2_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move to next Sub1Activity (Screen Transition)
                Intent move_main_sub2 = new Intent(Menu_Activity.this,Map_Activity.class);
                startActivity(move_main_sub2);
            }
        });


        //How Button3 works
        Button Sub3_Button = (Button) findViewById(R.id.button3);
        Sub3_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move to next Sub3Activity (Screen Transition)
                Intent move_main_sub3 = new Intent(Menu_Activity.this,Profile_Activity.class);
                startActivity(move_main_sub3);
            }
        });


        //How Button works
        Button Sub4_Button = (Button) findViewById(R.id.button4);
        Sub4_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move to next Sub43Activity (Screen Transition)
                Intent move_main_sub4 = new Intent(Menu_Activity.this,Contact_Activity1.class);
                startActivity(move_main_sub4);
            }
        });

        ImageView iv_background = findViewById(R.id.iv_background);
        AnimationDrawable animationDrawable = (AnimationDrawable) iv_background.getDrawable();
        animationDrawable.start();
    }
}
