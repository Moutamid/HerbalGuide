package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HerbsActivity extends AppCompatActivity {

    Button EvaluationBtn;
    ItemDetailModel model;
    DetailAdapter adapter;
    CircleImageView herb_img;
    TextView herb_name, heading1, heading2, heading3, heading4, heading5, heading6, heading7;
    ImageView backbtn;
    RecyclerView heading1RC, heading2RC, heading3RC, heading4RC, heading5RC, heading6RC, heading7RC;
    String[] headings, msg1, msg2, msg3, msg4, msg5, msg6, msg7;
    int len;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbs);

        EvaluationBtn = findViewById(R.id.EvaluationBtn);
        herb_img = findViewById(R.id.herb_img);
        herb_name = findViewById(R.id.herb_name);
        backbtn = findViewById(R.id.backbtn);

        heading1 = findViewById(R.id.heading1);
        heading2 = findViewById(R.id.heading2);
        heading3 = findViewById(R.id.heading3);
        heading4 = findViewById(R.id.heading4);
        heading5 = findViewById(R.id.heading5);
        heading6 = findViewById(R.id.heading6);
        heading7 = findViewById(R.id.heading7);

        heading1RC = findViewById(R.id.heading1RC);
        heading2RC = findViewById(R.id.heading2RC);
        heading3RC = findViewById(R.id.heading3RC);
        heading4RC = findViewById(R.id.heading4RC);
        heading5RC = findViewById(R.id.heading5RC);
        heading6RC = findViewById(R.id.heading6RC);
        heading7RC = findViewById(R.id.heading7RC);

        heading1RC.setLayoutManager(new LinearLayoutManager(this));
        heading2RC.setLayoutManager(new LinearLayoutManager(this));
        heading3RC.setLayoutManager(new LinearLayoutManager(this));
        heading4RC.setLayoutManager(new LinearLayoutManager(this));
        heading5RC.setLayoutManager(new LinearLayoutManager(this));
        heading6RC.setLayoutManager(new LinearLayoutManager(this));
        heading7RC.setLayoutManager(new LinearLayoutManager(this));

        heading1RC.setHasFixedSize(false);
        heading2RC.setHasFixedSize(false);
        heading3RC.setHasFixedSize(false);
        heading4RC.setHasFixedSize(false);
        heading5RC.setHasFixedSize(false);
        heading6RC.setHasFixedSize(false);
        heading7RC.setHasFixedSize(false);

        model = (ItemDetailModel) getIntent().getSerializableExtra("model");

        headings = model.getHeadings();


        herb_img.setImageResource(model.getImg());
        herb_name.setText(model.getName());

        len = headings.length;

        if (len == 1){
            heading1.setText(headings[0]);

            msg1 = model.getFirstlist();

            getDetails1();

            heading2.setVisibility(View.GONE);
            heading3.setVisibility(View.GONE);
            heading4.setVisibility(View.GONE);
            heading5.setVisibility(View.GONE);
            heading6.setVisibility(View.GONE);
            heading7.setVisibility(View.GONE);
        }
        else if (len == 2){
            heading1.setText(headings[0]);
            heading2.setText(headings[1]);

            msg1 = model.getFirstlist();
            msg2 = model.getSecondList();

            getDetails1();
            getDetails2();

            heading3.setVisibility(View.GONE);
            heading4.setVisibility(View.GONE);
            heading5.setVisibility(View.GONE);
            heading6.setVisibility(View.GONE);
            heading7.setVisibility(View.GONE);
        }
        else if (len == 3){
            heading1.setText(headings[0]);
            heading2.setText(headings[1]);
            heading3.setText(headings[2]);

            msg1 = model.getFirstlist();
            msg2 = model.getSecondList();
            msg3 = model.getThirdlist();

            getDetails1();
            getDetails2();
            getDetails3();

            heading4.setVisibility(View.GONE);
            heading5.setVisibility(View.GONE);
            heading6.setVisibility(View.GONE);
            heading7.setVisibility(View.GONE);
        }
        else if (len == 4){
            heading1.setText(headings[0]);
            heading2.setText(headings[1]);
            heading3.setText(headings[2]);
            heading4.setText(headings[3]);

            msg1 = model.getFirstlist();
            msg2 = model.getSecondList();
            msg3 = model.getThirdlist();
            msg4 = model.getFourthlist();

            getDetails1();
            getDetails2();
            getDetails3();
            getDetails4();

            heading5.setVisibility(View.GONE);
            heading6.setVisibility(View.GONE);
            heading7.setVisibility(View.GONE);
        }
        else if (len == 5){
            heading1.setText(headings[0]);
            heading2.setText(headings[1]);
            heading3.setText(headings[2]);
            heading4.setText(headings[3]);
            heading5.setText(headings[4]);

            msg1 = model.getFirstlist();
            msg2 = model.getSecondList();
            msg3 = model.getThirdlist();
            msg4 = model.getFourthlist();
            msg5 = model.getFifthlist();

            getDetails1();
            getDetails2();
            getDetails3();
            getDetails4();
            getDetails5();

            heading6.setVisibility(View.GONE);
            heading7.setVisibility(View.GONE);
        }
        else if (len == 6){
            heading1.setText(headings[0]);
            heading2.setText(headings[1]);
            heading3.setText(headings[2]);
            heading4.setText(headings[3]);
            heading5.setText(headings[4]);
            heading6.setText(headings[5]);

            msg1 = model.getFirstlist();
            msg2 = model.getSecondList();
            msg3 = model.getThirdlist();
            msg4 = model.getFourthlist();
            msg5 = model.getFifthlist();
            msg6 = model.getSixthlist();

            getDetails1();
            getDetails2();
            getDetails3();
            getDetails4();
            getDetails5();
            getDetails6();

            heading7.setVisibility(View.GONE);
        }
        else if (len == 7){
            heading1.setText(headings[0]);
            heading2.setText(headings[1]);
            heading3.setText(headings[2]);
            heading4.setText(headings[3]);
            heading5.setText(headings[4]);
            heading6.setText(headings[5]);
            heading7.setText(headings[6]);

            msg1 = model.getFirstlist();
            msg2 = model.getSecondList();
            msg3 = model.getThirdlist();
            msg4 = model.getFourthlist();
            msg5 = model.getFifthlist();
            msg6 = model.getSixthlist();
            msg7 = model.getSeventhlst();

            getDetails1();
            getDetails2();
            getDetails3();
            getDetails4();
            getDetails5();
            getDetails6();
            getDetails7();

        }

        heading1.setOnClickListener(v -> {
            int vv = (heading1RC.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            heading1RC.setVisibility(vv);
        });
        heading2.setOnClickListener(v -> {
            int vv = (heading2RC.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            heading2RC.setVisibility(vv);
        });
        heading3.setOnClickListener(v -> {
            int vv = (heading3RC.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            heading3RC.setVisibility(vv);
        });
        heading4.setOnClickListener(v -> {
            int vv = (heading4RC.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            heading4RC.setVisibility(vv);
        });
        heading5.setOnClickListener(v -> {
            int vv = (heading5RC.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            heading5RC.setVisibility(vv);
        });
        heading6.setOnClickListener(v -> {
            int vv = (heading6RC.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            heading6RC.setVisibility(vv);
        });
        heading7.setOnClickListener(v -> {
            int vv = (heading7RC.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            heading7RC.setVisibility(vv);
        });

        EvaluationBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, SurveyActivity.class));
        });

        backbtn.setOnClickListener(v -> {
            startActivity(new Intent(this, ItemsActivity.class));
            finish();
        });
    }

    private void getDetails1() {
        DetailAdapter adapter;
        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i < msg1.length; i++){
            list.add(msg1[i]);
        }
        adapter = new DetailAdapter(this, list);
        heading1RC.setAdapter(adapter);
    }
    private void getDetails2() {
        DetailAdapter adapter;
        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i < msg2.length; i++){
            list.add(msg2[i]);
        }
        adapter = new DetailAdapter(this, list);
        heading2RC.setAdapter(adapter);
    }
    private void getDetails3() {
        DetailAdapter adapter;
        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i < msg3.length; i++){
            list.add(msg3[i]);
        }
        adapter = new DetailAdapter(this, list);
        heading3RC.setAdapter(adapter);
    }
    private void getDetails4() {
        DetailAdapter adapter;
        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i < msg4.length; i++){
            list.add(msg4[i]);
        }
        adapter = new DetailAdapter(this, list);
        heading4RC.setAdapter(adapter);
    }
    private void getDetails5() {
        DetailAdapter adapter;
        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i < msg5.length; i++){
            list.add(msg5[i]);
        }
        adapter = new DetailAdapter(this, list);
        heading5RC.setAdapter(adapter);
    }
    private void getDetails6() {
        DetailAdapter adapter;
        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i < msg6.length; i++){
            list.add(msg6[i]);
        }
        adapter = new DetailAdapter(this, list);
        heading6RC.setAdapter(adapter);
    }
    private void getDetails7() {
        DetailAdapter adapter;
        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i < msg7.length; i++){
            list.add(msg7[i]);
        }
        adapter = new DetailAdapter(this, list);
        heading7RC.setAdapter(adapter);
    }
}