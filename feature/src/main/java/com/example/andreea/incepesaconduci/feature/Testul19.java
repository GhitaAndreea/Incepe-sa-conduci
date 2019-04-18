package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Testul19 extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup9;
    RadioButton aA9;
    RadioButton bB9;
    RadioButton cC9;
    Button next9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testul19);

        radioGroup9 = findViewById(R.id.Radio9);
        aA9 = findViewById(R.id.aA9);
        bB9 = findViewById(R.id.bB9);
        cC9 = findViewById(R.id.cC9);
        next9 = (Button) findViewById(R.id.button9next);
        aA9.setOnClickListener(this);
        bB9.setOnClickListener(this);
        cC9.setOnClickListener(this);
        next9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == aA9){
            TextView raspuns19 =  findViewById(R.id.Raspuns9);
            raspuns19.setText("gresit");
        }

        else if (v == bB9){
            TextView raspuns19 =  findViewById(R.id.Raspuns9);
            raspuns19.setText("gresit");
        }

        else if (v ==  cC9){
            TextView raspuns19 =  findViewById(R.id.Raspuns9);
            raspuns19.setText("corect");
        }
        if (v == next9){
            openTestul110();
        }
    }

    public void openTestul110() {
        Intent intent = new Intent(this, Testul110.class);
        startActivity(intent);

    }
}
