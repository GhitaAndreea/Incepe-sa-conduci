package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul18 extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup8;
    RadioButton aA8;
    RadioButton bB8;
    RadioButton cC8;
    Button next8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul18);

        radioGroup8 = findViewById(R.id.Radio8);
        aA8 = findViewById(R.id.aA8);
        bB8 = findViewById(R.id.bB8);
        cC8 = findViewById(R.id.cC8);
        next8 = (Button) findViewById(R.id.button8next);
        aA8.setOnClickListener(this);
        bB8.setOnClickListener(this);
        cC8.setOnClickListener(this);
        next8.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v == aA8){
            TextView raspuns18 =  findViewById(R.id.Raspuns8);
            raspuns18.setText("corect");
        }

        else if (v == bB8){
            TextView raspuns18 =  findViewById(R.id.Raspuns8);
            raspuns18.setText("gresit");
        }

        else if (v ==  cC8){
            TextView raspuns18 =  findViewById(R.id.Raspuns8);
            raspuns18.setText("gresit");
        }
        if (v == next8){
            openTestul19();
        }
    }

    public void openTestul19() {
        Intent intent = new Intent(this, Testul19.class);
        startActivity(intent);

    }
}
