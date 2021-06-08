package com.example.lecturen07;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC","onStart called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC","onResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC","onPause called");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC","onDestroy called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC","onStop called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",Count);
    }
    Button button;
    TextView textView;
    int Count=20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.BtnCount);
        textView=findViewById(R.id.TextViewcounter);
        Log.d("ALC","onCreate called");
        if (savedInstanceState!=null)
        {
            Count=savedInstanceState.getInt("value");
            textView.setText(String.valueOf(Count));
        }
    }
    public void Click(View view) {
        Count=Integer.parseInt(textView.getText().toString());
        Count--;
        textView.setText(String.valueOf(Count));
    }

    public void moveActivity2(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void moveActivity3(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }


}