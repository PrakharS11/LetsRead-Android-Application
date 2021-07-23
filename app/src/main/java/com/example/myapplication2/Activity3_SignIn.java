package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3_SignIn extends AppCompatActivity {
    Button btn_SignIn;
    TextView txt_forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3_signin);

        btn_SignIn=findViewById(R.id.btnSignIn);
        txt_forgot = findViewById(R.id.txt_forgot_pwd);

        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"loged in",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Activity5_base.class);
                startActivity(intent);
            }
        });

        /*txt_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                Fragment_ForgotPWD Fragment = new Fragment_ForgotPWD();
                transaction.add(R.id.forgotPWD,Fragment);
                transaction.commit();
            }
        });*/
    }
}



