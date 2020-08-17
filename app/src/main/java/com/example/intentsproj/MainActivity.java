package com.example.intentsproj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText e1;
    EditText e2;
    String s1;
    String s2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.activity_custom_toast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

        e1 = findViewById(R.id.editText2);
        e2 = findViewById(R.id.editText3);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                Toast.makeText(getApplicationContext(),"You Just click the button!",Toast.LENGTH_SHORT).show();
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                i.putExtra("value1",s1);
                i.putExtra("value2",s2);

                startActivity(i);
                finish();

            }


        });

}





}