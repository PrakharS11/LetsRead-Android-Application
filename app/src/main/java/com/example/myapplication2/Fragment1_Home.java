package com.example.myapplication2;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Fragment1_Home extends Fragment  {

    TextInputLayout book, author, genre;
    EditText editTextTitle, editTextMessage;
    Button add, channel1, channel2;
    DBManager DB;
    NotificationHelper mNotificationHelper;

    public Fragment1_Home(){}

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page6_fragment_home, container, false);

        book = view.findViewById(R.id.txt_book);
        author = view.findViewById(R.id.txt_author);
        genre = view.findViewById(R.id.txt_genre);
        add = view.findViewById(R.id.btn_add);
        DB = new DBManager(getActivity());

        editTextTitle = view.findViewById(R.id.edt_title);
        editTextMessage = view.findViewById(R.id.edt_message);
        channel1 = view.findViewById(R.id.btn_channel1);
        channel2 = view.findViewById(R.id.btn_channel2);


        mNotificationHelper = new NotificationHelper(getActivity());

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

        /*channel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendOnChannel1(editTextTitle.getText().toString(), editTextMessage.getText().toString());
            }
        });

        channel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendOnChannel2(editTextTitle.getText().toString(), editTextMessage.getText().toString());
            }
        });*/




        return view;
    }

    /*public void sendOnChannel1(String title, String message) {
        NotificationCompat.Builder nb = mNotificationHelper.getChannel1Notification(title, message);
        mNotificationHelper.getmManager().notify(1,nb.build());
    }

    public void sendOnChannel2(String title, String message) {
        NotificationCompat.Builder nb = mNotificationHelper.getChannel2Notification(title, message);
        mNotificationHelper.getmManager().notify(2,nb.build());
    }
*/

}