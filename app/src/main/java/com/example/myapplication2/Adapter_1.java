package com.example.myapplication2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_1 extends RecyclerView.Adapter<Adapter_1.myviewholder> {

    ArrayList<Constructor_1> dataholder;

    public Adapter_1(ArrayList<Constructor_1> dataholder) {
        this.dataholder = dataholder;
    }

    @Override
    public myviewholder onCreateViewHolder( ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.page7_fragment_favorites_singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder( myviewholder holder, int position)
    {
        holder.book1.setText(dataholder.get(position).getBook());
        holder.author1.setText(dataholder.get(position).getAuthor());
        holder.genre1.setText(dataholder.get(position).getGenre());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView book1,author1,genre1;
        public myviewholder( View itemView)
        {
            super(itemView);
            book1=(TextView)itemView.findViewById(R.id.Book);
            author1=(TextView)itemView.findViewById(R.id.Author);
            genre1=(TextView)itemView.findViewById(R.id.Genre);
        }
    }
}
