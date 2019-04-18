package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul1 extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    RadioButton aA;
    RadioButton bB;
    RadioButton cC;
    Button next1;
    int p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul1);

        radioGroup = findViewById(R.id.Radio1);
        aA = findViewById(R.id.aA);
        bB = findViewById(R.id.bB);
        cC = findViewById(R.id.cC);
        next1 = (Button) findViewById(R.id.button1next);
        aA.setOnClickListener(this);
        bB.setOnClickListener(this);
        cC.setOnClickListener(this);
        next1.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v == aA){
            TextView raspuns =  findViewById(R.id.raspuns);
            raspuns.setText("corect");
            p=p+1;
        }

        else if (v == bB){
            TextView raspuns =  findViewById(R.id.raspuns);
            raspuns.setText("gresit");
        }

        else if (v ==  cC){
            TextView raspuns =  findViewById(R.id.raspuns);
            raspuns.setText("gresit");
        }
        if (v == next1){
            openTestul12();
        }
    }
     public void openTestul12() {
        Intent intent = new Intent (this, Testul12.class);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
