package com.example.latihan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button BshowToast;
    private Button Bincrement;
    private TextView TVnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BshowToast= findViewById(R.id.BShowToast);
        BshowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        Bincrement = findViewById(R.id.BIncrement);
        TVnumber = findViewById(R.id.textNumber);
    }
}
