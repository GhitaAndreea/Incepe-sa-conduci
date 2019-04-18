package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul110 extends AppCompatActivity  implements View.OnClickListener{

    RadioGroup radioGroup10;
    RadioButton aA10;
    RadioButton bB10;
    RadioButton cC10;
    Button final1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul110);

        radioGroup10 = findViewById(R.id.Radio10);
        aA10 = findViewById(R.id.aA10);
        bB10 = findViewById(R.id.bB10);
        cC10 = findViewById(R.id.cC10);
        final1 = (Button) findViewById(R.id.button1final);
        aA10.setOnClickListener(this);
        bB10.setOnClickListener(this);
        cC10.setOnClickListener(this);
        final1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == aA10){
            TextView raspuns110 =  findViewById(R.id.Raspuns10);
            raspuns110.setText("gresit");
        }

        else if (v == bB10){
            TextView raspuns110 =  findViewById(R.id.Raspuns10);
            raspuns110.setText("gresit");
        }

        else if (v ==  cC10){
            TextView raspuns110 =  findViewById(R.id.Raspuns10);
            raspuns110.setText("corect");
        }
        if (v == final1){
            openmainactivity2();
        }
    }

    public void openmainactivity2() {
        Intent intent = new Intent(this, mainactivity2.class);
        startActivity(intent);

    }
}
