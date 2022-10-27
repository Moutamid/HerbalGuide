package com.moutamid.herbalguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.herbalguide.R;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ItemVH> {
    Context context;
    ArrayList<String> list;

    public DetailAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public DetailAdapter.ItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.details_list_item, parent, false);
        return new DetailAdapter.ItemVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailAdapter.ItemVH holder, int position) {
        holder.name.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ItemVH extends RecyclerView.ViewHolder{
        TextView name;
        public ItemVH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.detailMessage);
        }
    }
}

