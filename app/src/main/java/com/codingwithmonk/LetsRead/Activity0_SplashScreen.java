package com.codingwithmonk.LetsRead;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Activity0_SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page0_splashscreen);

        Thread thread = new Thread(){

            public void run(){
                try{
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(Activity0_SplashScreen.this, Activity_base.class);
                    startActivity(intent);
                }

            }
        };thread.start();

    }
}
