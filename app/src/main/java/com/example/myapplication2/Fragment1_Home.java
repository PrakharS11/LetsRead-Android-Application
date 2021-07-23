package com.example.myapplication2;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1_Home extends Fragment {

    TextInputLayout book, author, genre;
    Button add;
    DBManager DB;

    public Fragment1_Home(){}

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page6_fragment_home, container, false);

        book = view.findViewById(R.id.txt_book);
        author = view.findViewById(R.id.txt_author);
        genre = view.findViewById(R.id.txt_genre);
        add = view.findViewById(R.id.btn_add);
        DB = new DBManager(getActivity());


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String bookTXT = book.getEditText().getText().toString();
                String authorTXT = author.getEditText().getText().toString();
                String genreTXT =genre.getEditText().getText().toString();

                Boolean checkInsertData = DB.addRecord(bookTXT,authorTXT,genreTXT);
                if (checkInsertData==true)
                    Toast.makeText(getActivity().getApplicationContext(), "New entry inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity().getApplicationContext(), "Not inserted", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}