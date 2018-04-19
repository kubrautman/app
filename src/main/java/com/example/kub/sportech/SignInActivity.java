package com.example.kub.sportech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SignInActivity extends AppCompatActivity {
    TextView kayitOl;
    Button giris;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        kayitOl=(TextView)findViewById(R.id.textView_kayitOl) ;
        kayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

    giris=(Button)findViewById(R.id.btn_login);
    giris.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(SignInActivity.this,MainActivity.class);
            startActivity(intent);
        }
    });

    }


}
