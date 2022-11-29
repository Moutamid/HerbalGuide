package com.moutamid.herbalguide.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.herbalguide.HerbsActivity;
import com.moutamid.herbalguide.model.ItemDetailModel;
import com.moutamid.herbalguide.R;

import java.util.ArrayList;
import java.util.Collection;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemVH> implements Filterable {

    Context context;
    ArrayList<ItemDetailModel> list;
    ArrayList<ItemDetailModel> listAll;
    final int i = 3;

    public ItemAdapter(Context context, ArrayList<ItemDetailModel> list) {
        this.context = context;
        this.list = list;
        listAll = new ArrayList<>(list);
    }

    @NonNull
    @Override
    public ItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ItemVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemVH holder, int position) {
        ItemDetailModel model = list.get(position);
        holder.image.setImageResource(model.getImg());
        holder.name.setText(model.getName());
        holder.name2.setText(model.getArabic_name());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, HerbsActivity.class);
            intent.putExtra("model", model);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList<ItemDetailModel> filterList = new ArrayList<>();
            if (charSequence.toString().isEmpty()){
                filterList.addAll(listAll);
            } else {
                for (ItemDetailModel listModel : listAll){
                    if (
                            listModel.getName().toLowerCase().contains(charSequence.toString().toLowerCase()) ||
                                    listModel.getArabic_name().toLowerCase().contains(charSequence.toString().toLowerCase())
                            ){
                        filterList.add(listModel);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = filterList;

            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            list.clear();
            list.addAll((Collection<? extends ItemDetailModel>) filterResults.values);
            notifyDataSetChanged();
        }
    };



    public class ItemVH extends RecyclerView.ViewHolder{
        CircleImageView image;
        TextView name,name2;
        public ItemVH(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image1);
            name = itemView.findViewById(R.id.name1);
            name2 = itemView.findViewById(R.id.name);
        }
    }
}
