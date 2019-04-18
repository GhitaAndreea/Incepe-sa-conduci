package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul16 extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup6;
    RadioButton aA6;
    RadioButton bB6;
    RadioButton cC6;
    Button next6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul16);

        radioGroup6 = findViewById(R.id.Radio6);
        aA6 = findViewById(R.id.aA6);
        bB6 = findViewById(R.id.bB6);
        cC6= findViewById(R.id.cC6);
        next6 = (Button) findViewById(R.id.button6next);
        aA6.setOnClickListener(this);
        bB6.setOnClickListener(this);
        cC6.setOnClickListener(this);
        next6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == aA6){
            TextView raspuns16 =  findViewById(R.id.Raspuns6);
            raspuns16.setText("corect");
        }

        else if (v == bB6){
            TextView raspuns16 =  findViewById(R.id.Raspuns6);
            raspuns16.setText("gresit");
        }

        else if (v ==  cC6){
            TextView raspuns16 =  findViewById(R.id.Raspuns6);
            raspuns16.setText("gresit");
        }
        if (v == next6){
            openTestul17();
        }
    }

    public void openTestul17() {
        Intent intent = new Intent(this, Testul17.class);
        startActivity(intent);

    }
}
