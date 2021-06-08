package com.example.lecturen07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    int Count=20;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        button=findViewById(R.id.button);
    }


    public void count(View view) {
        Count=Integer.parseInt(textView.getText().toString());
        Count--;
        textView.setText(String.valueOf(Count));
    }
}