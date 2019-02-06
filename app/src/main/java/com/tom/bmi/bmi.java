package com.tom.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class bmi extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private Button bHelp;

    public void bmi(View v) {
        //取得元件並計算BMi
        String w = edWeight.getText().toString() ;
        String h = edHeight.getText().toString() ;
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height)*10000;
        Log.d("BMI", String.valueOf(bmi));
        String aaa= String.format("%.3f" , bmi);  //
        Toast.makeText(this, String.valueOf(aaa), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        //取得畫面元件
        findViews();
    }

    private void findViews() {
        edWeight = (EditText) findViewById(R.id.ed_weight);
        edHeight = (EditText) findViewById(R.id.ed_height);
        bHelp = (Button) findViewById(R.id.b_help);
    }
}
