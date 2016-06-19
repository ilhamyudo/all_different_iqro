package com.iqro.agung.projectiqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MetodeIqro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_iqro);
    }

    public void onCLickIqro(View v){
        if(v.getId() == R.id.btn_iqro1){
            Intent i = new Intent(MetodeIqro.this,MetodeIqro1.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }else if(v.getId() == R.id.btn_iqro2){
            Intent i = new Intent(MetodeIqro.this,MetodeIqro2.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }
    }

    @Override
    public void onBackPressed() {

    }
}
