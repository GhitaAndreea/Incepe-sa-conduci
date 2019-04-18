package com.example.andreea.incepesaconduci.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class V1 extends AppCompatActivity {

    Button startv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v1);

        startv1 = (Button) findViewById(R.id.startv1);

        startv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == startv1) {
                    openTestul1();
                }
            }
        });
    }
    private void openTestul1() {
        Intent intent = new Intent(this, Testul1.class);
        startActivity(intent);
    }
}
