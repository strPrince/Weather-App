package com.example.weather.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.weather.Domains.FutureDomain;
import com.example.weather.Domains.Hourly;
import com.example.weather.R;

import java.util.ArrayList;

public class FutureAdapters extends RecyclerView.Adapter<FutureAdapters.ViewHolder>{
  ArrayList<FutureDomain> items;
  Context context;
    @NonNull
    @Override
    public FutureAdapters.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_future, parent, false);
        context=parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull FutureAdapters.ViewHolder holder, int position) {

holder.daytxt.setText(items.get(position).getDate());
holder.status.setText(items.get(position).getStatus());
holder.lowtxt.setText(items.get(position).getLowTemp()+"°");
holder.hightxt.setText(items.get(position).getHighTemp()+"°");

      int drawableResourceId =holder.itemView.getResources().getIdentifier(items.get(position).getPicPath(), "drawable", holder.itemView.getContext().getPackageName());
     Glide.with(context).load(drawableResourceId).into(holder.pic);
    }

    public FutureAdapters(ArrayList<FutureDomain> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {
        TextView daytxt,status,lowtxt,hightxt;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            daytxt = itemView.findViewById(R.id.daytxt);
            status = itemView.findViewById(R.id.statustxt);
            lowtxt = itemView.findViewById(R.id.lowtxt);
            hightxt = itemView.findViewById(R.id.hightxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
