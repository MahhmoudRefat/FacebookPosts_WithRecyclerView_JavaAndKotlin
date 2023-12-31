package com.example.facebookposts_withrecyclerview_javaandkotlin;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class postsRecyclerAdapter extends RecyclerView.Adapter<postsRecyclerAdapter.ViewHolder> {

    List<PostData> items;
    public postsRecyclerAdapter(List<PostData> items) {
        this.items = items;
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        //calling
        TextView account_name;
        TextView hours_counter;
        TextView post_text;
        TextView post_link;
        TextView likes_count;
        TextView share_count;
        ImageView image_id;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            account_name = itemView.findViewById(R.id.acount_name);
            hours_counter = itemView.findViewById(R.id.post_date);
            post_text = itemView.findViewById(R.id.post_word);
            post_link = itemView.findViewById(R.id.post_link);
            likes_count = itemView.findViewById(R.id.like_number);
            share_count = itemView.findViewById(R.id.tv_share_number);
            image_id = itemView.findViewById(R.id.post_image);

        }
    }
    @Override
    public int getItemCount() {
        if (items == null) return 0;
        return items.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e("viewHolder","creating viewHolder ") ;
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false); //impleicity type inference
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //creation
        Log.e("viewHolder","Binding data  to item number " + position) ;
        PostData item = items.get(position);
        holder.account_name.setText(item.account_name);
        holder.hours_counter.setText(String.valueOf(item.hours_counter));
        holder.post_text.setText(item.post_text);
        holder.post_link.setText(item.post_link);
        holder.likes_count.setText(String.valueOf(item.likes_count));
        holder.share_count.setText(String.valueOf(item.share_count));
        holder.image_id.setImageResource(item.image_id);
    }



}
