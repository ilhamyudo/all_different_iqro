package com.iqro.agung.projectiqro;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class CobaSpeech extends AppCompatActivity {


    TextView textResult;
    ImageButton rekam;
    int rekamOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_speech);
        textResult = (TextView)findViewById(R.id.textRekam);
        rekam = (ImageButton)findViewById(R.id.btn_rekam_coba);
        rekamOn = 0;
    }

    public void onCLickRekamn(View v){
        if (rekamOn == 0){
            rekamOn = 1;
            rekam.setBackgroundResource(R.drawable.btn_rekam_on);
            promptSpeechInput();
        }else{
            rekamOn = 0;
            rekam.setBackgroundResource(R.drawable.btn_rekam_off);
        }
    }

    public void promptSpeechInput(){
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
        voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en");
        voicerecogize.putExtra("android.speech.extra.EXTRA_ADDITIONAL_LANGUAGES", new String[]{});
        try{
            startActivityForResult(voicerecogize, 100);
        }catch(ActivityNotFoundException a){
            Toast.makeText(CobaSpeech.this, "Sorry your device not support speech recognizition", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onActivityResult(int resultCode, int requestCode, Intent intent) {
        if(requestCode == 100 && requestCode == RESULT_OK);
        {
            ArrayList<String > results = intent.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            textResult.setText(results.get(0));
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
