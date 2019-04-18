package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Testul12 extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup2;
    RadioButton aA1;
    RadioButton bB1;
    RadioButton cC1;
    Button next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul12);

        radioGroup2 = findViewById(R.id.Radio2);
        aA1 = findViewById(R.id.aA1);
        bB1 = findViewById(R.id.bB1);
        cC1 = findViewById(R.id.cC1);
        next2 = (Button) findViewById(R.id.button2next);
        aA1.setOnClickListener(this);
        bB1.setOnClickListener(this);
        cC1.setOnClickListener(this);
        next2.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (v == aA1){
            TextView raspuns2 =  findViewById(R.id.Raspuns12);
            raspuns2.setText("gresit");
        }

        else if (v == bB1){
            TextView raspuns2 =  findViewById(R.id.Raspuns12);
            raspuns2.setText("gresit");
        }

        else if (v ==  cC1){
            TextView raspuns2 =  findViewById(R.id.Raspuns12);
            raspuns2.setText("corect");
        }
        if (v == next2){
            openTestul13();
        }
    }
    public void openTestul13() {
        Intent intent = new Intent (this, Testul13.class);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}
