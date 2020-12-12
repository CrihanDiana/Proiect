package com.example.game_univer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView ImageView;
    TextView mTitle, mdesc;
    ItemClickListener itemClickListener;

    MyHolder(@NonNull View itemView) {
        super(itemView);

        this.ImageView = itemView.findViewById(R.id.image1);
        this.mTitle = itemView.findViewById(R.id.title);
        this.mdesc = itemView.findViewById(R.id.description);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){

        this.itemClickListener = ic;
    }
}
