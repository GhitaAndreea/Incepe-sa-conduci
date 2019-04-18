package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainactivity2 extends AppCompatActivity {


    Button v1;
    Button v2;
    Button v3;
    Button v4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);

        v1 = (Button) findViewById(R.id.v1);
        v2 = (Button) findViewById(R.id.v2);
        v3 = (Button) findViewById(R.id.v3);
        v4 = (Button) findViewById(R.id.v4);


        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == v1) {
                    openV1();
                }
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == v2) {
                    openV2();
                }
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == v3) {
                    openV3();
                }
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == v4) {
                    openV4();
                }
            }
        });
    }
    private void openV1() {
            Intent intent = new Intent(this, V1.class);
            startActivity(intent);
    }

    private void openV2() {
        Intent intent = new Intent(this, V2.class);
        startActivity(intent);
    }
    private void openV3() {
        Intent intent = new Intent(this, V3.class);
        startActivity(intent);
    }
    private void openV4() {
        Intent intent = new Intent(this, V4.class);
        startActivity(intent);
    }


}
