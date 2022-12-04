package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.moutamid.herbalguide.model.QuestionListModel;

import java.util.ArrayList;

public class SurveyScreen extends AppCompatActivity {


    private RadioGroup group1,group2,group3,group4,group5,group6,group7,group8,group9,group10,
            group11,group12,
            group13,group14,group15,group16,group17,group18,group19,group20,group21,group22,group23
            ,group24,group25,group26,group27,group28,group29,group30;

    private RadioGroup agroup1, agroup2, agroup3, agroup4, agroup5, agroup6, agroup7, agroup8, agroup9,
            agroup10, agroup11, agroup12, agroup13, agroup14, agroup15, agroup16, agroup17, agroup18,
            agroup19, agroup20, agroup21, agroup22, agroup23, agroup24, agroup25;

    private AppCompatButton submitBtn;
    private boolean sent = false;

    int selectedId1,selectedId2,selectedId3,selectedId4,selectedId5,selectedId6,selectedId7,selectedId8,
            selectedId9,selectedId10,selectedId11,selectedId12,selectedId13,selectedId14,selectedId15,
            selectedId16,selectedId17,selectedId18,selectedId19,selectedId20,selectedId21,selectedId22,
            selectedId23,selectedId24,selectedId25,selectedId26,selectedId27,
            selectedId28,selectedId29,selectedId30 = 0;

    int aselectedId1, aselectedId2, aselectedId3, aselectedId4, aselectedId5, aselectedId6,
            aselectedId7, aselectedId8, aselectedId9, aselectedId10, aselectedId11, aselectedId12,
            aselectedId13, aselectedId14, aselectedId15, aselectedId16, aselectedId17, aselectedId18,
            aselectedId19, aselectedId20, aselectedId21, aselectedId22, aselectedId23, aselectedId24,
            aselectedId25 = 0;

    private String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,ans11,ans12,ans13,ans14,ans15,ans16,ans17,ans18,ans19,ans20,ans21,ans22,ans23,ans24,ans25,ans26,ans27,ans28,ans29,ans30 ="";
    private ImageView backImg;
    private ArrayList<QuestionListModel> questionListModels = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_screen);

        backImg = findViewById(R.id.backbtn);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ItemsActivity.class));
                finish();
            }
        });
        group1 = findViewById(R.id.grou1);
        group2 = findViewById(R.id.group2);
        group3 = findViewById(R.id.group3);
        group4 = findViewById(R.id.group4);
        group5 = findViewById(R.id.group5);
        group6 = findViewById(R.id.group6);
        group7 = findViewById(R.id.group7);
        group8 = findViewById(R.id.group8);
        group9 = findViewById(R.id.group9);
        group10 = findViewById(R.id.group10);
        group11 = findViewById(R.id.group11);
        group12 = findViewById(R.id.group12);
        group13 = findViewById(R.id.group13);
        group14 = findViewById(R.id.group14);
        group15 = findViewById(R.id.group15);
        group16 = findViewById(R.id.group16);
        group17 = findViewById(R.id.group17);
        group18 = findViewById(R.id.group18);
        group19 = findViewById(R.id.group19);
        group20 = findViewById(R.id.group20);
        group21 = findViewById(R.id.group21);
        group22 = findViewById(R.id.group22);
        group23 = findViewById(R.id.group23);
        group24 = findViewById(R.id.group24);
        group25 = findViewById(R.id.group25);
        group26 = findViewById(R.id.group26);
        group27 = findViewById(R.id.group27);
        group28 = findViewById(R.id.group28);
        group29 = findViewById(R.id.group29);
        group30 = findViewById(R.id.group30);

//        NEW GROUPS
        agroup1 = findViewById(R.id.agroup1);
        agroup2 = findViewById(R.id.agroup2);
        agroup3 = findViewById(R.id.agroup3);
        agroup4 = findViewById(R.id.agroup4);
        agroup5 = findViewById(R.id.agroup5);
        agroup6 = findViewById(R.id.agroup6);
        agroup7 = findViewById(R.id.agroup7);
        agroup8 = findViewById(R.id.agroup8);
        agroup9 = findViewById(R.id.agroup9);
        agroup10 = findViewById(R.id.agroup10);
        agroup11 = findViewById(R.id.agroup11);
        agroup12 = findViewById(R.id.agroup12);
        agroup13 = findViewById(R.id.agroup13);
        agroup14 = findViewById(R.id.agroup14);
        agroup15 = findViewById(R.id.agroup15);
        agroup16 = findViewById(R.id.agroup16);
        agroup17 = findViewById(R.id.agroup17);
        agroup18 = findViewById(R.id.agroup18);
        agroup19 = findViewById(R.id.agroup19);
        agroup20 = findViewById(R.id.agroup20);
        agroup21 = findViewById(R.id.agroup21);
        agroup22 = findViewById(R.id.agroup22);
        agroup23 = findViewById(R.id.agroup23);
        agroup24 = findViewById(R.id.agroup24);
        agroup25 = findViewById(R.id.agroup25);


        submitBtn = findViewById(R.id.entryBtn);

        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId1 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId1);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques1), String.valueOf(radioButton.getText())));

            }
        });

        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId2 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId2);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques2), String.valueOf(radioButton.getText())));
            }
        });

        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId3 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId3);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques3), String.valueOf(radioButton.getText())));
            }
        });

        group4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId4 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId4);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques4), String.valueOf(radioButton.getText())));
            }
        });

        group5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId5 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId5);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques5), String.valueOf(radioButton.getText())));
            }
        });

        group6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId6 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId6);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques6), String.valueOf(radioButton.getText())));
            }
        });

        group7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId7 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId7);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques7), String.valueOf(radioButton.getText())));
            }
        });

        group8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId8 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId8);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques8), String.valueOf(radioButton.getText())));
            }
        });

        group9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId9 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId9);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques9), String.valueOf(radioButton.getText())));
            }
        });

        group10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId10 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId10);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques10), String.valueOf(radioButton.getText())));
            }
        });

        group11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId11 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId11);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques11), String.valueOf(radioButton.getText())));
            }
        });

        group12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId12 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId12);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques12), String.valueOf(radioButton.getText())));
            }
        });

        group13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId13 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId13);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques13), String.valueOf(radioButton.getText())));
            }
        });

        group14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId14 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId14);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques14), String.valueOf(radioButton.getText())));
            }
        });

        group15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId15 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId15);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques15), String.valueOf(radioButton.getText())));
            }
        });

        group16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId16 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId16);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques16), String.valueOf(radioButton.getText())));
            }
        });

        group17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId17 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId17);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques17), String.valueOf(radioButton.getText())));
            }
        });

        group18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId18 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId18);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques18), String.valueOf(radioButton.getText())));
            }
        });

        group19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId19 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId19);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques19), String.valueOf(radioButton.getText())));
            }
        });

        group20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId20 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId20);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques20), String.valueOf(radioButton.getText())));
            }
        });

        group21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId21 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId21);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques21), String.valueOf(radioButton.getText())));
            }
        });

        group22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId22 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId22);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques22), String.valueOf(radioButton.getText())));
            }
        });

        group23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId23 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId23);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques23), String.valueOf(radioButton.getText())));
            }
        });

        group24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId24 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId24);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques24), String.valueOf(radioButton.getText())));
            }
        });
        group25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId25 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId25);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques25), String.valueOf(radioButton.getText())));
            }
        });

        group26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId26 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId26);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques26), String.valueOf(radioButton.getText())));
            }
        });

        group27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId27 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId27);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques27), String.valueOf(radioButton.getText())));
            }
        });

        group28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId28 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId28);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques28), String.valueOf(radioButton.getText())));
            }
        });

        group29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId29 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId29);
                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques29), String.valueOf(radioButton.getText())));
            }
        });
        group30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId30 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId30);

                questionListModels.add(new QuestionListModel(getString(R.string.survey_ques30), String.valueOf(radioButton.getText())));
            }
        });

//        NEW GROUPS LISTENERS
        agroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId1 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId1);
                questionListModels.add(new QuestionListModel(getString(R.string.ques1), String.valueOf(radioButton.getText())));
            }
        });

        agroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId2 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId2);
                questionListModels.add(new QuestionListModel(getString(R.string.ques2), String.valueOf(radioButton.getText())));
            }
        });

        agroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId3 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId3);
                questionListModels.add(new QuestionListModel(getString(R.string.ques3), String.valueOf(radioButton.getText())));
            }
        });

        agroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId4 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId4);
                questionListModels.add(new QuestionListModel(getString(R.string.ques4), String.valueOf(radioButton.getText())));
            }
        });

        agroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId5 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId5);
                questionListModels.add(new QuestionListModel(getString(R.string.ques5), String.valueOf(radioButton.getText())));
            }
        });

        agroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId6 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId6);
                questionListModels.add(new QuestionListModel(getString(R.string.ques6), String.valueOf(radioButton.getText())));
            }
        });

        agroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId7 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId7);
                questionListModels.add(new QuestionListModel(getString(R.string.ques7), String.valueOf(radioButton.getText())));
            }
        });

        agroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId8 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId8);
                questionListModels.add(new QuestionListModel(getString(R.string.ques8), String.valueOf(radioButton.getText())));
            }
        });

        agroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId9 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId9);
                questionListModels.add(new QuestionListModel(getString(R.string.ques9), String.valueOf(radioButton.getText())));
            }
        });

        agroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId10 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId10);
                questionListModels.add(new QuestionListModel(getString(R.string.ques10), String.valueOf(radioButton.getText())));
            }
        });

        agroup11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId11 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId11);
                questionListModels.add(new QuestionListModel(getString(R.string.ques11), String.valueOf(radioButton.getText())));
            }
        });

        agroup12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId12 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId12);
                questionListModels.add(new QuestionListModel(getString(R.string.ques12), String.valueOf(radioButton.getText())));
            }
        });

        agroup13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId13 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId13);
                questionListModels.add(new QuestionListModel(getString(R.string.ques13), String.valueOf(radioButton.getText())));
            }
        });

        agroup14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId14 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId14);
                questionListModels.add(new QuestionListModel(getString(R.string.ques14), String.valueOf(radioButton.getText())));
            }
        });

        agroup15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId15 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId15);
                questionListModels.add(new QuestionListModel(getString(R.string.ques15), String.valueOf(radioButton.getText())));
            }
        });

        agroup16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId16 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId16);
                questionListModels.add(new QuestionListModel(getString(R.string.ques16), String.valueOf(radioButton.getText())));
            }
        });

        agroup17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId17 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId17);
                questionListModels.add(new QuestionListModel(getString(R.string.ques17), String.valueOf(radioButton.getText())));
            }
        });

        agroup18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId18 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId18);
                questionListModels.add(new QuestionListModel(getString(R.string.ques18), String.valueOf(radioButton.getText())));
            }
        });

        agroup19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId19 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId19);
                questionListModels.add(new QuestionListModel(getString(R.string.ques19), String.valueOf(radioButton.getText())));
            }
        });

        agroup20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId20 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId20);
                questionListModels.add(new QuestionListModel(getString(R.string.ques20), String.valueOf(radioButton.getText())));
            }
        });

        agroup21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId21 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId21);
                questionListModels.add(new QuestionListModel(getString(R.string.ques21), String.valueOf(radioButton.getText())));
            }
        });

        agroup22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId22 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId22);
                questionListModels.add(new QuestionListModel(getString(R.string.ques22), String.valueOf(radioButton.getText())));
            }
        });

        agroup23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId23 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId23);
                questionListModels.add(new QuestionListModel(getString(R.string.ques23), String.valueOf(radioButton.getText())));
            }
        });

        agroup24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId24 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId24);
                questionListModels.add(new QuestionListModel(getString(R.string.ques24), String.valueOf(radioButton.getText())));
            }
        });
        agroup25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                aselectedId25 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(aselectedId25);
                questionListModels.add(new QuestionListModel(getString(R.string.ques25), String.valueOf(radioButton.getText())));
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedId1 != 0 && selectedId2 != 0 && selectedId3 !=0 && selectedId4 != 0 && selectedId5 != 0 &&
                        selectedId6 !=0 && selectedId7 != 0 && selectedId8 != 0 && selectedId9 != 0 && selectedId10 != 0 &&
                        selectedId11 != 0 && selectedId12 != 0 && selectedId13 !=0 && selectedId14 != 0 && selectedId15 != 0 &&
                        selectedId16 !=0 && selectedId17 != 0 && selectedId18 != 0 && selectedId19 != 0 && selectedId20 != 0 &&
                        selectedId21 != 0 && selectedId22 != 0 && selectedId23 != 0 && selectedId24 != 0 && selectedId25 != 0 &&
                        selectedId26 != 0 && selectedId27 != 0 && selectedId28 != 0 && selectedId29
                        != 0 && selectedId30 != 0
                        &&
                        aselectedId1 != 0 && aselectedId2 != 0 && aselectedId3 != 0 && aselectedId4 != 0 && aselectedId5 != 0 &&
                        aselectedId6 != 0 && aselectedId7 != 0 && aselectedId8 != 0 && aselectedId9 != 0 && aselectedId10 != 0 &&
                        aselectedId11 != 0 && aselectedId12 != 0 && aselectedId13 != 0 && aselectedId14 != 0 && aselectedId15 != 0 &&
                        aselectedId16 != 0 && aselectedId17 != 0 && aselectedId18 != 0 && aselectedId19 != 0 && aselectedId20 != 0 &&
                        aselectedId21 != 0 && aselectedId22 != 0 && aselectedId23 != 0
                        && aselectedId24 != 0 && aselectedId25 != 0
                ){

                    String to = "0533665281kamar@gmail.com";
                    //  String to = "kainatkhan1546@gmail.com";
                    String subject = "Herbal Guide's ANSWERS\nYes";
                    // String message = "Yes";

                    ArrayList<String> messageList = new ArrayList<>();
                    for (int i = 0; i < questionListModels.size(); i++) {
                        QuestionListModel model = questionListModels.get(i);
                        String message = model.getQuestion() + "\n" + model.getPoint1() + "\n";
                        messageList.add(message);
                    }

                    Intent email = new Intent(Intent.ACTION_SEND);

                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                    email.putExtra(Intent.EXTRA_SUBJECT, subject);
                    email.putExtra(Intent.EXTRA_TEXT, messageList.toString());
                    //need this to prompts email client only
                    email.setType("message/rfc822");
                    if (email.resolveActivity(getPackageManager()) != null) {
                        startActivity(email);
                        sent = true;
                    } else {
                        Toast.makeText(SurveyScreen.this, "Couldn't find an email app and account", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(SurveyScreen.this,"Please Answer these Questions",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        if (sent) {
            finish();
        }
    }

}