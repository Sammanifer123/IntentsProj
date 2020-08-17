package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t1;
    TextView t2;
    String s1;
    String s2;
    Button add,sub,div,multi;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1 = findViewById(R.id.textView2);
        t2 = findViewById(R.id.textView3);
        res=findViewById(R.id.result);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        multi = findViewById(R.id.multi);
        s2 = getIntent().getExtras().getString("value1");
        s1 = getIntent().getExtras().getString("value2");

        t1.setText(s1);
        t2.setText(s2);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                Integer add = n1 + n2;
                res.setText(add.toString());
            }


            });

        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                Integer sub = n1 - n2;
                res.setText(sub.toString());

            }


        });
        multi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                Integer multi = n1 * n2;
                res.setText(multi.toString());

            }


        });
        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                Integer div = n1/n2;
                res.setText(div.toString());

            }


        });

    }
}