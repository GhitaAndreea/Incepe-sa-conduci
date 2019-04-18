package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul17 extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup7;
    RadioButton aA7;
    RadioButton bB7;
    RadioButton cC7;
    Button next7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul17);

        radioGroup7 = findViewById(R.id.Radio7);
        aA7 = findViewById(R.id.aA7);
        bB7 = findViewById(R.id.bB7);
        cC7 = findViewById(R.id.cC7);
        next7 = (Button) findViewById(R.id.button7next);
        aA7.setOnClickListener(this);
        bB7.setOnClickListener(this);
        cC7.setOnClickListener(this);
        next7.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v == aA7){
            TextView raspuns17 =  findViewById(R.id.Raspuns7);
            raspuns17.setText("corect");
        }

        else if (v == bB7){
            TextView raspuns17 =  findViewById(R.id.Raspuns7);
            raspuns17.setText("gresit");
        }

        else if (v ==  cC7){
            TextView raspuns17 =  findViewById(R.id.Raspuns7);
            raspuns17.setText("gresit");
        }
        if (v == next7){
            openTestul18();
        }
    }

    public void openTestul18() {
        Intent intent = new Intent(this, Testul18.class);
        startActivity(intent);

    }
}
