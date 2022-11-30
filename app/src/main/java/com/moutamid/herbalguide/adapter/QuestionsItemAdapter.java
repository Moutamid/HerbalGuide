package com.moutamid.herbalguide.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.herbalguide.HerbsActivity;
import com.moutamid.herbalguide.R;
import com.moutamid.herbalguide.model.ItemDetailModel;
import com.moutamid.herbalguide.model.QuestionListModel;

import java.util.ArrayList;
import java.util.Collection;

import de.hdodenhof.circleimageview.CircleImageView;

public class QuestionsItemAdapter extends RecyclerView.Adapter<QuestionsItemAdapter.ItemVH>{

    Context context;
    ArrayList<QuestionListModel> list;
    final int i = 3;

    public QuestionsItemAdapter(Context context, ArrayList<QuestionListModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.question_custom_layout, parent, false);
        return new ItemVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemVH holder, int position) {
        QuestionListModel model = list.get(position);
        holder.question.setText(model.getQuestion());
        holder.radioButton1.setText(model.getPoint1());
        holder.radioButton2.setText(model.getPoint2());
        holder.radioButton3.setText(model.getPoint3());
        holder.radioButton4.setText(model.getPoint4());

        if (model.getPoint3().equals("") && model.getPoint4().equals("")){
            holder.radioButton3.setVisibility(View.GONE);
            holder.radioButton4.setVisibility(View.GONE);
        }else {
            holder.radioButton3.setVisibility(View.VISIBLE);
            holder.radioButton4.setVisibility(View.VISIBLE);

        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class ItemVH extends RecyclerView.ViewHolder{

        TextView question;
        RadioButton radioButton1,radioButton2,radioButton3,radioButton4;

        public ItemVH(@NonNull View itemView) {
            super(itemView);
            question = itemView.findViewById(R.id.question);
            radioButton1 = itemView.findViewById(R.id.q11);
            radioButton2 = itemView.findViewById(R.id.q12);
            radioButton3 = itemView.findViewById(R.id.q13);
            radioButton4 = itemView.findViewById(R.id.q14);
        }
    }
}
