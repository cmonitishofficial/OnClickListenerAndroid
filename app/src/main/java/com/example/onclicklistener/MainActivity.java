package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvFirst,tvSecond,tvThird,tvFourth,tvFifth,tvSixth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFirst = findViewById(R.id.tvFirst);
        tvSecond = findViewById(R.id.tvSecond);
        tvThird = findViewById(R.id.tvThird);
        tvFourth = findViewById(R.id.tvFourth);
        tvFifth = findViewById(R.id.tvFifth);
        tvSixth = findViewById(R.id.tvSixth);

        tvThird.setOnClickListener(this);
        tvFourth.setOnClickListener(this);
        tvFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvFirst.setText("Clicked First");
            }
        });
        tvSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSecond.setText("Clicked Second");
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvThird:
                tvThird.setText("Third Click");
                break;
            case R.id.tvFourth:
                tvFourth.setText("Forth Click");
                break;
        }
    }

    public void funFifth(View view) {
//        tvFifth.setText("Clicked Fifth");
    }

    public void funSix(View view) {
//        tvSixth.setText("Clicked Sixth");
    }
}