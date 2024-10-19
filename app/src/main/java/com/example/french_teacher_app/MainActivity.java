package com.example.french_teacher_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button black,green,purple,red,yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        black=findViewById(R.id.btn1);
        green=findViewById(R.id.btn2);
        purple=findViewById(R.id.btn3);
        red=findViewById(R.id.btn4);
        yellow=findViewById(R.id.btn5);

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.black);

                mediaPlayer.start();
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.green);

                mediaPlayer.start();
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.purple);

                mediaPlayer.start();
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.red);

                mediaPlayer.start();
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.yellow);

                mediaPlayer.start();
            }
        });
    }
}