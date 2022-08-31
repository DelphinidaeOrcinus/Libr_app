package com.example.library_app;

import static com.example.mylibrary.GFG2.getSHA;
import static com.example.mylibrary.GFG2.toHexString;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;

import com.example.mylibrary.TestLibrary;

import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    Button btn,sifre_btn,btn_sayfageç;
    MultiAutoCompleteTextView txt;
    TestLibrary t1=new TestLibrary();
    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        txt=findViewById(R.id.textim);
        sifre_btn=findViewById(R.id.sifre_buttonu);
        btn_sayfageç=findViewById(R.id.btn_geçiş);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int x=t1.letsHit();
               String s=String.valueOf(x);
               btn.setText(s);
            }
        });
        sifre_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=txt.getText().toString();

                try {
                  txt.setText("\n" + s1 + " : " + toHexString(getSHA(s1)));
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        });

        btn_sayfageç.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sayfa2=new Intent(MainActivity.this, AES.class);
                startActivity(sayfa2);
            }
        });



    }
}