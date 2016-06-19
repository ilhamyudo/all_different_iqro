package com.iqro.agung.projectiqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MetodeIqro1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_iqro1);
    }

    public void onBackPressed() {

    }


    public void OnClickIqro1(View v){
        if(v.getId() == R.id.btn_home_iqro1) {
            Intent i = new Intent(MetodeIqro1.this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }
    }
}
