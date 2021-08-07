package com.codingwithmonk.LetsRead;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment5_Signup extends Fragment {
    Button btn_SignUp;
    TextView txt_SignIn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page2_signup, container, false);
        btn_SignUp=view.findViewById(R.id.btnSignUp2);
        txt_SignIn =view.findViewById(R.id.txtSignIn2);
        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"Verification in Process",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity().getApplicationContext(), Activity_base.class);
                startActivity(intent);
            }
        });

        txt_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), Fragment4_SignIn.class);
                startActivity(intent);
            }
        });
        return view;
    }
}