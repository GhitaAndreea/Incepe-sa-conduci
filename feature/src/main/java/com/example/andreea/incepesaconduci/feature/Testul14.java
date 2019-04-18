package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul14 extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup4;
    RadioButton aA4;
    RadioButton bB4;
    RadioButton cC4;
    Button next4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul14);

        radioGroup4 = findViewById(R.id.Radio4);
        aA4 = findViewById(R.id.aA4);
        bB4 = findViewById(R.id.bB4);
        cC4 = findViewById(R.id.cC4);
        next4 = (Button) findViewById(R.id.button4next);
        aA4.setOnClickListener(this);
        bB4.setOnClickListener(this);
        cC4.setOnClickListener(this);
        next4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == aA4){
            TextView raspuns14 =  findViewById(R.id.Raspuns4);
            raspuns14.setText("corect");
        }

        else if (v == bB4){
            TextView raspuns14 =  findViewById(R.id.Raspuns4);
            raspuns14.setText("gresit");
        }

        else if (v ==  cC4){
            TextView raspuns14 =  findViewById(R.id.Raspuns4);
            raspuns14.setText("gresit");
        }
        if (v == next4){
            openTestul15();
        }
    }

    public void openTestul15() {
        Intent intent = new Intent (this, Testul15.class);
        startActivity(intent);

    }
}
