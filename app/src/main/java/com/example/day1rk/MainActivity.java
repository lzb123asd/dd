package com.example.day1rk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewA, imageViewB, imageViewD;
    private TextView textViewC, textView, biaoti;
    private LinearLayout linearLayout;
    private TextView itemone, itemtwo, itemthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewA = findViewById(R.id.A);
        imageViewB = findViewById(R.id.B);
        textViewC = findViewById(R.id.C);
        imageViewD = findViewById(R.id.D);
        textView = findViewById(R.id.text);
        itemone = findViewById(R.id.item0);
        itemtwo = findViewById(R.id.item1);
        itemthree = findViewById(R.id.item2);
        linearLayout = findViewById(R.id.layout);
        biaoti = findViewById(R.id.text_biaoti);


        itemone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "item0", Toast.LENGTH_SHORT).show();
            }
        });
        itemtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "item1", Toast.LENGTH_SHORT).show();
            }
        });

        itemthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biaoti.setText("新标题");
            }
        });
        imageViewD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setVisibility(View.VISIBLE);
            }
        });


        imageViewA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("这是A");
                linearLayout.setVisibility(View.GONE);
            }
        });

        imageViewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("这是B");
                linearLayout.setVisibility(View.GONE);
            }
        });

        textViewC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("这是C");
                linearLayout.setVisibility(View.GONE);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "123", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
