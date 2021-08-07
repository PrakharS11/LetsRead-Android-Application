package com.codingwithmonk.LetsRead;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import java.util.ArrayList;

public class Adapter_2 extends RecyclerView.Adapter<Adapter_2.myviewholder>
{
    ArrayList<Constructor_2> dataholder;



    public Adapter_2(ArrayList<Constructor_2> dataholder) {
        this.dataholder = dataholder;
    }


    @Override
    public myviewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.page8_fragment_search_single_row,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder( myviewholder holder, int position)
    {
        holder.header.setText(dataholder.get(position).getHeader());
        holder.desc.setText(dataholder.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {

        TextView header,desc;
        public myviewholder( View itemView)
        {
            super(itemView);
            header=itemView.findViewById(R.id.t1);
            desc=itemView.findViewById(R.id.t2);
        }
    }
}

