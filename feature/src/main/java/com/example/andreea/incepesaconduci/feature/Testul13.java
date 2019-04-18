package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul13 extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup3;
    RadioButton aA2;
    RadioButton bB2;
    RadioButton cC2;
    Button next3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul13);

        radioGroup3 = findViewById(R.id.Radio3);
        aA2 = findViewById(R.id.aA2);
        bB2 = findViewById(R.id.bB2);
        cC2 = findViewById(R.id.cC2);
        next3 = (Button) findViewById(R.id.button3next);
        aA2.setOnClickListener(this);
        bB2.setOnClickListener(this);
        cC2.setOnClickListener(this);
        next3.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == aA2){
            TextView raspuns3 =  findViewById(R.id.Raspuns13);
            raspuns3.setText("corect");
        }

        else if (v == bB2){
            TextView raspuns3 =  findViewById(R.id.Raspuns13);
            raspuns3.setText("gresit");
        }

        else if (v ==  cC2){
            TextView raspuns2 =  findViewById(R.id.Raspuns13);
            raspuns2.setText("gresit");
        }
        if (v == next3){
            openTestul14();
        }
    }

    public void openTestul14() {
        Intent intent = new Intent (this, Testul14.class);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}
