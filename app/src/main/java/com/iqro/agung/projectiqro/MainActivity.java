package com.iqro.agung.projectiqro;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.UrlQuerySanitizer;
import android.os.IBinder;
import android.renderscript.Sampler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ImageButton i;
    MediaPlayer backSound;
    private int length = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backSound = MediaPlayer.create(this, R.raw.intro);

        try{
            if(backSound==null){
                backSound = MediaPlayer.create(this, R.raw.intro);
                backSound.start();
                backSound.prepareAsync();
                backSound.setLooping(true);
            }else if(backSound.isPlaying()){
                backSound.seekTo(length);
                backSound.start();
            }
        }catch(NullPointerException n){

        }
        /**
        doBindService();
        Intent music = new Intent();
        music.setClass(this,PlayMusic.class);
        startService(music);**/

    }

    public void pauseMusic()
    {
        if(backSound.isPlaying())
        {
            backSound.pause();
            length=backSound.getCurrentPosition();
        }
    }
    public void resumeMusic()
    {
        if(backSound.isPlaying()==false)
        {
            backSound.seekTo(length);
            backSound.start();
        }
    }

    public void stopMusic()
    {
        backSound.stop();
        backSound.release();
        backSound = null;
    }

    @Override
    public void onBackPressed() {
        exit();
    }

    public void onButtonHomeClick(View v) {
        if (v.getId() == R.id.informasi) {
            Intent i = new Intent(MainActivity.this, Informasi.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish();
        } else if (v.getId() == R.id.pengaturan) {
            Intent i = new Intent(MainActivity.this, Pengaturan.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            finish();
        } else if (v.getId() == R.id.pelafalan) {
            Intent i = new Intent(MainActivity.this, Pelafalan.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            //pauseMusic();
        } else if (v.getId() == R.id.menu_latihan) {
            Intent i = new Intent(MainActivity.this, latihanPelafalan.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            //pauseMusic();
        } else if (v.getId() == R.id.metodeIqro) {
            Intent i = new Intent(MainActivity.this, MetodeIqro.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            //pauseMusic();
        }
    }

    private void exit() {
        ExitDialog exitDialog = new ExitDialog(this);
        exitDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        exitDialog.show();
    }
    /**
    private boolean mIsBound = false;
    PlayMusic mServ;
    private ServiceConnection Scon =new ServiceConnection(){
        @Override
        public void onServiceConnected(ComponentName name, IBinder
                binder) {
            PlayMusic.ServiceBinder bind = (PlayMusic.ServiceBinder) binder;
            mServ = bind.getService();
        }

        public void onServiceDisconnected(ComponentName name) {
            mServ = null;
        }
    };

    void doBindService(){
        bindService(new Intent(this,PlayMusic.class),
                Scon,Context.BIND_AUTO_CREATE);
        mIsBound = true;
    }

    void doUnbindService()
    {
        if(mIsBound)
        {
            unbindService(Scon);
            mIsBound = false;
        }
    }**/
}
