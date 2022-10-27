package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class HerbsActivity extends AppCompatActivity {

    Button EvaluationBtn;
    String name;
    int image;

    CircleImageView herb_img;
    TextView herb_name;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbs);
        EvaluationBtn = findViewById(R.id.EvaluationBtn);
        herb_img = findViewById(R.id.herb_img);
        herb_name = findViewById(R.id.herb_name);
        backbtn = findViewById(R.id.backbtn);

        image = getIntent().getIntExtra("image", 0);
        name = getIntent().getStringExtra("name");

        herb_img.setImageResource(image);
        herb_name.setText(name);

        EvaluationBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, SurveyActivity.class));
        });

        backbtn.setOnClickListener(v -> {
            startActivity(new Intent(this, ItemsActivity.class));
            finish();
        });
    }
}