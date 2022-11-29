package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.moutamid.herbalguide.model.SurveyModel;

public class SurveyActivity extends AppCompatActivity {

    AppCompatButton finishEvaluation;
    SurveyModel surveyModel;
    EditText ques1, ques2, ques3, ques4, ques5, ques6, ques7, ques8, ques9, ques10, ques11, ques12;
    ProgressDialog progressDialog;
    private ImageView backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        finishEvaluation = findViewById(R.id.finishEvaluation);
        ques1 = findViewById(R.id.question_1);
        ques2 = findViewById(R.id.question_2);
        ques3 = findViewById(R.id.question_3);
        ques4 = findViewById(R.id.question_4);
        ques5 = findViewById(R.id.question_5);
        ques6 = findViewById(R.id.question_6);
        ques7 = findViewById(R.id.question_7);
        ques8 = findViewById(R.id.question_8);
        ques9 = findViewById(R.id.question_9);
        ques10 = findViewById(R.id.question_10);
        ques11 = findViewById(R.id.question_11);
        ques12 = findViewById(R.id.question_12);

        backImg = findViewById(R.id.backbtn);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ItemsActivity.class));
                finish();
            }
        });

        progressDialog = new ProgressDialog(SurveyActivity.this);
        progressDialog.setMessage("يرجى الانتظار حتى نتلقى تقييمك");

        finishEvaluation.setOnClickListener(v -> {
            progressDialog.show();
            surveyModel = new SurveyModel(
                    ques1.getText().toString(),
                    ques2.getText().toString(),
                    ques3.getText().toString(),
                    ques4.getText().toString(),
                    ques5.getText().toString(),
                    ques6.getText().toString(),
                    ques7.getText().toString(),
                    ques8.getText().toString(),
                    ques9.getText().toString(),
                    ques10.getText().toString(),
                    ques11.getText().toString(),
                    ques12.getText().toString()
            );
            Constants.databaseReference().child("surveys").child(Constants.auth().getCurrentUser().getUid())
                            .setValue(surveyModel)
                    .addOnSuccessListener(unused -> {
                        progressDialog.dismiss();
                        startActivity(new Intent(this, ThankYouActivity.class));
                        finish();
                    }).addOnFailureListener(e -> {
                        progressDialog.dismiss();
                        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    });
        });

    }
}