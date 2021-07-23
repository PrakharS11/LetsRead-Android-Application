package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
    Button btn_SignUp, btn_SignIn,getBtn_sql;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);



        btn_SignUp=findViewById(R.id.btnSignUp);
        btn_SignIn =findViewById(R.id.btnSignIn);




        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity2_SignUp.class);
                startActivity(intent);
            }
        });

        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity3_SignIn.class);
                startActivity(intent);
            }
        });




    }
}
