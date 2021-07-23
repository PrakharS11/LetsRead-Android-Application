package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Activity2_SignUp extends AppCompatActivity {
    Button btn_SignUp;
    TextView txt_SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2_signup);

        btn_SignUp=findViewById(R.id.btnSignUp2);
        txt_SignIn = findViewById(R.id.txtSignIn2);

        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Verification in Process",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Activity1.class);
                startActivity(intent);
            }
        });

        txt_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity3_SignIn.class);
                startActivity(intent);
            }
        });
    }
}
