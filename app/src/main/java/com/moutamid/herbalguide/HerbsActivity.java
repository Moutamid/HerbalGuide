package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HerbsActivity extends AppCompatActivity {

    Button EvaluationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbs);
        EvaluationBtn = findViewById(R.id.EvaluationBtn);

        EvaluationBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, ThankYouActivity.class));
        });
    }
}