package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul15 extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup5;
    RadioButton aA5;
    RadioButton bB5;
    RadioButton cC5;
    Button next5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul15);

        radioGroup5 = findViewById(R.id.Radio5);
        aA5 = findViewById(R.id.aA5);
        bB5 = findViewById(R.id.bB5);
        cC5 = findViewById(R.id.cC5);
        next5 = (Button) findViewById(R.id.button5next);
        aA5.setOnClickListener(this);
        bB5.setOnClickListener(this);
        cC5.setOnClickListener(this);
        next5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == aA5){
            TextView raspuns15 =  findViewById(R.id.Raspuns5);
            raspuns15.setText("corect");
        }

        else if (v == bB5){
            TextView raspuns15 =  findViewById(R.id.Raspuns5);
            raspuns15.setText("gresit");
        }

        else if (v ==  cC5){
            TextView raspuns15 =  findViewById(R.id.Raspuns5);
            raspuns15.setText("gresit");
        }
        if (v == next5){
            openTestul16();
        }
    }

    public void openTestul16() {
        Intent intent = new Intent (this, Testul16.class);
        startActivity(intent);

    }
}
