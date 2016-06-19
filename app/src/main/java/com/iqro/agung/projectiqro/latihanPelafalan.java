package com.iqro.agung.projectiqro;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class latihanPelafalan extends AppCompatActivity {

    private int rekamOn;
    ImageView selectedImg;
    ImageButton rekam, selected;
    TextView txtTemp;
    String tmpStr="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_pelafalan);
        rekamOn = 0;
        rekam=(ImageButton)findViewById(R.id.latihan_btnRekam);
        selectedImg=(ImageView)findViewById(R.id.hasil_rekam);
        txtTemp=(TextView)findViewById(R.id.textView);
    }

    public void OnButtonPelafalanBack(View v){
        Intent i = new Intent(latihanPelafalan.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

    public void onBackPressed() {

    }

    public void onClickLatihanRecord(View v){
        if (rekamOn == 0){
            rekamOn = 1;
            rekam.setBackgroundResource(R.drawable.btn_rekam_on);
            promptSpeechInput();
        }else{
            rekamOn = 0;
            rekam.setBackgroundResource(R.drawable.btn_rekam_off);
        }
    }

    private void promptSpeechInput(){
        /*Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US");
        i.putExtra(RecognizerIntent.EXTRA_PROMPT, "Say something");

        try{
            startActivityForResult(i,100);
        }catch(ActivityNotFoundException a){
            Toast.makeText(CobaSpeech.this, "Sorry your device not support speech recognizition", Toast.LENGTH_LONG).show();
        }*/

        Intent voicerecogize = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        voicerecogize.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
        voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "in_ID");
        voicerecogize.putExtra("android.speech.extra.EXTRA_ADDITIONAL_LANGUAGES", new String[]{});
        try{
            startActivityForResult(voicerecogize, 100);
        }catch(ActivityNotFoundException a){
            Toast.makeText(latihanPelafalan.this, "Sorry your device not support speech recognizition", Toast.LENGTH_LONG).show();
        }
    }

    public void onActivityResult(int resultCode, int requestCode, Intent intent) {
        if(requestCode == 100 && requestCode == RESULT_OK);
        {
            ArrayList<String> results = intent.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            tmpStr = results.get(0);
            txtTemp.setText(tmpStr);

            if (tmpStr.equalsIgnoreCase("Alif")){
                selectedImg.setBackgroundResource(R.drawable.a_03);
                selected = (ImageButton)findViewById(R.id.latihan_alif);
                selected.setBackgroundResource(R.drawable.a_02);
            }else if (tmpStr.equalsIgnoreCase("Mbak")){
                selectedImg.setBackgroundResource(R.drawable.ba_03);
                selected = (ImageButton)findViewById(R.id.latihan_ba);
                selected.setBackgroundResource(R.drawable.ba_02);
            }else if (tmpStr.equalsIgnoreCase("Tak")){
                selectedImg.setBackgroundResource(R.drawable.ta_03);
                selected = (ImageButton)findViewById(R.id.latihan_ta);
                selected.setBackgroundResource(R.drawable.ta_02);
            }else if (tmpStr.equalsIgnoreCase("hack")){
                selectedImg.setBackgroundResource(R.drawable.ha_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("coc")){
                selectedImg.setBackgroundResource(R.drawable.kho_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("dak")){
                selectedImg.setBackgroundResource(R.drawable.da_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("rok")){
                selectedImg.setBackgroundResource(R.drawable.ro_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("za")){
                selectedImg.setBackgroundResource(R.drawable.za_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("shock")){
                selectedImg.setBackgroundResource(R.drawable.syo_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("do")){
                selectedImg.setBackgroundResource(R.drawable.dho_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("i'm")){
                selectedImg.setBackgroundResource(R.drawable.dho_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("go")){
                selectedImg.setBackgroundResource(R.drawable.dho_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("fac")){
                selectedImg.setBackgroundResource(R.drawable.fa_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("kak")){
                selectedImg.setBackgroundResource(R.drawable.qo_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("la")){
                selectedImg.setBackgroundResource(R.drawable.la_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("ma")){
                selectedImg.setBackgroundResource(R.drawable.ma_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("wa")){
                selectedImg.setBackgroundResource(R.drawable.wa_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }else if (tmpStr.equalsIgnoreCase("ya")){
                selectedImg.setBackgroundResource(R.drawable.ya_03);
                //hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            }


        }

        /*switch(requestCode){
            case 100:if(resultCode == RESULT_OK && intent != null)
            {
                ArrayList<String> result = intent.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                textResult.setText("Sudah mulai pusing");
            }
                break;
        }*/
        super.onActivityResult(resultCode, requestCode, intent);
    }
}
