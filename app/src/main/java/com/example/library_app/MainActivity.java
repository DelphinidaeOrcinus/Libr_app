package com.example.library_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mylibrary.TestLibrary;

public class MainActivity extends AppCompatActivity {

        Button btn;
    TestLibrary t1=new TestLibrary();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int x=t1.letsHit();
               String s=String.valueOf(x);
               btn.setText(s);
            }
        });




    }
}