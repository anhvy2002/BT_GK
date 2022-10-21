package com.test.giaodienprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GiaDung_Activity_1 extends AppCompatActivity {
    ImageButton ibBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gia_dung1);

        ibBack = (ImageButton) findViewById(R.id.imageButton);
        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(GiaDung_Activity_1.this, Home_Activity.class);
                startActivity(myIntent);
            }
        });
    }
}