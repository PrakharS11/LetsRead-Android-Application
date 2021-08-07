package com.codingwithmonk.LetsRead;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Fragment2_Favorites extends Fragment {

    EditText book;
    Button delete;
    DBManager DB;
    RecyclerView recyclerView;
    ArrayList<Constructor_1> dataHolder;
    Adapter_1 adapter;
    Cursor cursor;


    public Fragment2_Favorites() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page7_fragment_favorites, container, false);

        book = view.findViewById(R.id.txt_delete);
        delete = view.findViewById(R.id.btn_delete);
        DB = new DBManager(getActivity());
        recyclerView = view.findViewById(R.id.recview1);
        dataHolder = new ArrayList<>();


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bookTXT = book.getText().toString();

                Boolean checkDeleteData = DB.delRecord(bookTXT);
                
                if (checkDeleteData == true) {

                    Toast.makeText(getActivity().getApplicationContext(), "New delete "+book+" this", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getActivity().getApplicationContext(), "Not delete", Toast.LENGTH_SHORT).show();
                }

            }
        });

        adapter = new Adapter_1(dataHolder);
        cursor = new DBManager(getActivity()).readData();

        while (cursor.moveToNext()) {
            Constructor_1 obj = new Constructor_1(cursor.getString(1), cursor.getString(2), cursor.getString(3));
            dataHolder.add(obj);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}



