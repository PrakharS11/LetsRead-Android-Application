package com.example.myapplication2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment3_Search extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Constructor_2> dataholder;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.page8_fragment_search,container,false);

        recyclerView=view.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder=new ArrayList<>();

        Constructor_2 ob1=new Constructor_2("Angular","Web Application");
        dataholder.add(ob1);

        Constructor_2 ob2=new Constructor_2("C Programming","Embed Programming");
        dataholder.add(ob2);

        Constructor_2 ob3=new Constructor_2("C++ Programming","Embed Programming");
        dataholder.add(ob3);

        Constructor_2 ob4=new Constructor_2(".NET Programming","Desktop and Web Programming");
        dataholder.add(ob4);

        Constructor_2 ob5=new Constructor_2("Java Programming","Desktop and Web Programming");
        dataholder.add(ob5);

        Constructor_2 ob6=new Constructor_2("Magento","Web Application Framework");
        dataholder.add(ob6);

        Constructor_2 ob7=new Constructor_2("NodeJS","Web Application Framework");
        dataholder.add(ob7);

        Constructor_2 ob8=new Constructor_2("Python","Desktop and Web Programming");
        dataholder.add(ob8);

        Constructor_2 ob9=new Constructor_2("Shopify","E-Commerce Framework");
        dataholder.add(ob9);

        Constructor_2 ob10=new Constructor_2("Wordpress","WebApplication Framewrok");
        dataholder.add(ob10);

        recyclerView.setAdapter(new Adapter_2(dataholder));

        return view;

    }
}










/*listView =(ListView) view.findViewById(R.id.list_view);
        arrayList =new ArrayList<String>();
        arrayAdapter =new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1,arrayList);
        listView.setAdapter(arrayAdapter);
        arrayList.add("Delhi");
        arrayList.add("Bengaluru");
        arrayList.add("Mumbai");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String string=arrayList.get(position);
                Activity5_base mainActivity=(Activity5_base) getActivity();
                mainActivity.fun1(string);
            }
        });*/