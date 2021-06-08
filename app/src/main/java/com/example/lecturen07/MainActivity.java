package com.example.lecturen07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    int Count=20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.BtnCount);
        textView=findViewById(R.id.TextViewcounter);
    }

    public void Click(View view) {
        Count=Integer.parseInt(textView.getText().toString());
        Count--;
        textView.setText(String.valueOf(Count));
    }
}