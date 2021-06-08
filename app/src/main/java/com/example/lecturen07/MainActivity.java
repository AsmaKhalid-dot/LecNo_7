package com.example.lecturen07;
import androidx.appcompat.app.AppCompatActivity;
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
    }
    public void Click(View view) {
        Count=Integer.parseInt(textView.getText().toString());
        Count--;
        textView.setText(String.valueOf(Count));
    }
}