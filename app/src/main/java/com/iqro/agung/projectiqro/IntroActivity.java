package com.iqro.agung.projectiqro;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class IntroActivity extends AppCompatActivity {

    //Set Lama waktu splash screen
    private static int splashInterval = 4000;
    private ImageView intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        intro = (ImageView) findViewById(R.id.logo);

        intro.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) intro.getBackground()).start();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //TODO Auto-generated method stub
                Intent i = new Intent(IntroActivity.this,MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();

                //Jeda Selesai Splash Screen
                this.finish();
            }

            private void finish(){

            }
        },splashInterval);
    }
}
