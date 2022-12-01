package com.moutamid.herbalguide;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.moutamid.herbalguide.adapter.QuestionsItemAdapter;
import com.moutamid.herbalguide.model.QuestionListModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<QuestionListModel> questionListModels = new ArrayList<>();
    public static final int REQUEST_CODE_MAIL = 1000;
    private RadioGroup group1,group2,group3,group4,group5,group6,group7,group8,group9,group10,group11,group12,group13,group14,group15,group16,group17,group18,group19,group20,group21,group22,group23,group24,group25;
    private AppCompatButton submitBtn;
    private boolean sent = false;
    int selectedId1,selectedId2,selectedId3,selectedId4,selectedId5,selectedId6,selectedId7,selectedId8,selectedId9,selectedId10,selectedId11,selectedId12,selectedId13,selectedId14,selectedId15,selectedId16,selectedId17,selectedId18,selectedId19,selectedId20,selectedId21,selectedId22,selectedId23,selectedId24,selectedId25 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  recyclerView = findViewById(R.id.recyclerView);
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
        submitBtn = findViewById(R.id.entryBtn);

        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId1 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId1);
                questionListModels.add(new QuestionListModel(getString(R.string.ques1),String.valueOf(radioButton.getText())));
            }
        });

        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId2 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId2);
                questionListModels.add(new QuestionListModel(getString(R.string.ques2),String.valueOf(radioButton.getText())));
            }
        });

        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId3 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId3);
                questionListModels.add(new QuestionListModel(getString(R.string.ques3),String.valueOf(radioButton.getText())));
            }
        });

        group4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId4 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId4);
                questionListModels.add(new QuestionListModel(getString(R.string.ques4),String.valueOf(radioButton.getText())));
            }
        });

        group5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId5 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId5);
                questionListModels.add(new QuestionListModel(getString(R.string.ques5),String.valueOf(radioButton.getText())));
            }
        });

        group6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId6 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId6);
                questionListModels.add(new QuestionListModel(getString(R.string.ques6),String.valueOf(radioButton.getText())));
            }
        });

        group7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId7 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId7);
                questionListModels.add(new QuestionListModel(getString(R.string.ques7),String.valueOf(radioButton.getText())));
            }
        });

        group8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId8 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId8);
                questionListModels.add(new QuestionListModel(getString(R.string.ques8),String.valueOf(radioButton.getText())));            }
        });

        group9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId9 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId9);
                questionListModels.add(new QuestionListModel(getString(R.string.ques9),String.valueOf(radioButton.getText())));
            }
        });

        group10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId10 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId10);
                questionListModels.add(new QuestionListModel(getString(R.string.ques10),String.valueOf(radioButton.getText())));
            }
        });

        group11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId11 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId11);
                questionListModels.add(new QuestionListModel(getString(R.string.ques11),String.valueOf(radioButton.getText())));
            }
        });

        group12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId12 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId12);
                questionListModels.add(new QuestionListModel(getString(R.string.ques12),String.valueOf(radioButton.getText())));
            }
        });

        group13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId13 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId13);
                questionListModels.add(new QuestionListModel(getString(R.string.ques13),String.valueOf(radioButton.getText())));
            }
        });

        group14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId14 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId14);
                questionListModels.add(new QuestionListModel(getString(R.string.ques14),String.valueOf(radioButton.getText())));
            }
        });

        group15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId15 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId15);
                questionListModels.add(new QuestionListModel(getString(R.string.ques15),String.valueOf(radioButton.getText())));
            }
        });

        group16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId16 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId16);
                questionListModels.add(new QuestionListModel(getString(R.string.ques16),String.valueOf(radioButton.getText())));
            }
        });

        group17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId17 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId17);
                questionListModels.add(new QuestionListModel(getString(R.string.ques17),String.valueOf(radioButton.getText())));
            }
        });

        group18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId18 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId18);
                questionListModels.add(new QuestionListModel(getString(R.string.ques18),String.valueOf(radioButton.getText())));
            }
        });

        group19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId19 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId19);
                questionListModels.add(new QuestionListModel(getString(R.string.ques19),String.valueOf(radioButton.getText())));
            }
        });

        group20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId20 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId20);
                questionListModels.add(new QuestionListModel(getString(R.string.ques20),String.valueOf(radioButton.getText())));
            }
        });

        group21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId21 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId21);
                questionListModels.add(new QuestionListModel(getString(R.string.ques21),String.valueOf(radioButton.getText())));
            }
        });

        group22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId22 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId22);
                questionListModels.add(new QuestionListModel(getString(R.string.ques22),String.valueOf(radioButton.getText())));
            }
        });

        group23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId23 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId23);
                questionListModels.add(new QuestionListModel(getString(R.string.ques23),String.valueOf(radioButton.getText())));
            }
        });

        group24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId24 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId24);
                questionListModels.add(new QuestionListModel(getString(R.string.ques24),String.valueOf(radioButton.getText())));
            }
        });
        group25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                selectedId25 = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId25);
                questionListModels.add(new QuestionListModel(getString(R.string.ques25),String.valueOf(radioButton.getText())));
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (selectedId1 != 0 && selectedId2 != 0 && selectedId3 !=0 && selectedId4 != 0 && selectedId5 != 0 &&
                      selectedId6 !=0 && selectedId7 != 0 && selectedId8 != 0 && selectedId9 != 0 && selectedId10 != 0 &&
                      selectedId11 != 0 && selectedId12 != 0 && selectedId13 !=0 && selectedId14 != 0 && selectedId15 != 0 &&
                      selectedId16 !=0 && selectedId17 != 0 && selectedId18 != 0 && selectedId19 != 0 && selectedId20 != 0 &&
                      selectedId21 != 0 && selectedId22 != 0 && selectedId23 != 0 && selectedId24 != 0 && selectedId25 != 0){
                //  String to = "0533665281kamar@gmail.com";
                  String to = "kainatkhan1546@gmail.com";
                  String subject = "Herbal Guide's ANSWERS\nYes";
                 // String message = "Yes";

                  ArrayList<String> messageList = new ArrayList<>();
                  for (int i = 0; i < questionListModels.size(); i++){
                      QuestionListModel model = questionListModels.get(i);
                      String message = model.getQuestion() +"\n" +model.getPoint1() +"\n";
                      messageList.add(message);
                  }

                  Intent email = new Intent(Intent.ACTION_SEND);

                  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                  email.putExtra(Intent.EXTRA_SUBJECT, subject);
                  email.putExtra(Intent.EXTRA_TEXT, messageList.toString());
                 //need this to prompts email client only
                  email.setType("message/rfc822");
                  if (email.resolveActivity(getPackageManager()) != null) {
                      startActivity(email);
                      sent = true;
                  }else {
                      Toast.makeText(MainActivity.this,"Couldn't find an email app and account",Toast.LENGTH_SHORT).show();
                  }

              }else {
                  Toast.makeText(MainActivity.this,"Please Answer these Questions",Toast.LENGTH_SHORT).show();
              }
            }
        });
    }



    @Override
    protected void onResume() {
        super.onResume();
        if (sent) {
            Intent intent = new Intent(MainActivity.this, ItemsActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
         //   Toast.makeText(MainActivity.this, "Email Sent", Toast.LENGTH_SHORT).show();
        }
    }

}