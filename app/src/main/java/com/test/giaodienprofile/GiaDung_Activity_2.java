package com.test.giaodienprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GiaDung_Activity_2 extends AppCompatActivity {
    ImageButton ibBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gia_dung2);

        ibBack = (ImageButton) findViewById(R.id.imageButton2);
        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(GiaDung_Activity_2.this, Home_Activity.class);
                startActivity(myIntent);
            }
        });
    }
}