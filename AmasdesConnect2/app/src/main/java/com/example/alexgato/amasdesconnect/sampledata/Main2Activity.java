package com.example.alexgato.amasdesconnect.sampledata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alexgato.amasdesconnect.R;

public class Main2Activity extends AppCompatActivity {

    Button breturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        breturn = findViewById(R.id.butonReturn);

        breturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent;
                intent = new Intent(Main2Activity.this, MainActivity.class);

                startActivity(intent);

            }
        });


    }
}
