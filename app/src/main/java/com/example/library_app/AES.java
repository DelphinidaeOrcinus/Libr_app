package com.example.library_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mylibrary.AESECB;

public class AES extends AppCompatActivity {
    Button btn1;
    EditText edt1,edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aes);
        btn1=findViewById(R.id.şifrele_butonu);
        edt1=findViewById(R.id.edt_ecb);
        edt2=findViewById(R.id.edt_ecb2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                        String metin="";
                        edt1.getText().toString();
                AESECB d= null;
                try {
                    d = new AESECB();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                byte[] str= new byte[0];
                try {
                    edt2.setText("Encrypted String : "+str);
                    str = d.doEncryption(metin);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    edt1.setText("Encrypted String2 : "+d.doDecryption(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //System.out.println("Encrypted String : "+str);
                        //System.out.println("Encrypted String : "+d.doDecryption(str));



            }
        });
    }
}





