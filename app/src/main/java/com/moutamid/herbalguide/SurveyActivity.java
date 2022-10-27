package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SurveyActivity extends AppCompatActivity {

    Button finishEvaluation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        finishEvaluation = findViewById(R.id.finishEvaluation);

        finishEvaluation.setOnClickListener(v -> {
            startActivity(new Intent(this, ThankYouActivity.class));
            finish();
        });

    }
}