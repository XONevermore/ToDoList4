package com.example.sardor.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

public class AdapterNigga extends RecyclerView.Adapter<AdapterNigga.MyViewHolder> {
    private LayoutInflater layoutInflater;
    private List<Info> infos = Collections.emptyList();
    AdapterNigga(Context context, List<Info> info){
        layoutInflater = LayoutInflater.from(context);
        infos = info;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
            myViewHolder.title = infos.get(i).getTitle();
            myViewHolder.about = infos.get(i).getAbout();
    }

    @Override
    public int getItemCount() {
        return infos.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        String title;
        String about;
        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title).toString();
            about = itemView.findViewById(R.id.about).toString();
        }
    }
}
