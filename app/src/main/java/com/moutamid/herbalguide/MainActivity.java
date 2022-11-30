package com.moutamid.herbalguide;

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

   /* private String[] questions = {getResources().getString(R.string.ques1),
            getResources().getString(R.string.ques2),getResources().getString(R.string.ques3),
            getResources().getString(R.string.ques4),getResources().getString(R.string.ques5),
            getResources().getString(R.string.ques6),getResources().getString(R.string.ques7),getResources().getString(R.string.ques8),getResources().getString(R.string.ques9),getResources().getString(R.string.ques10),
            getResources().getString(R.string.ques11),getResources().getString(R.string.ques12),getResources().getString(R.string.ques13),getResources().getString(R.string.ques14),getResources().getString(R.string.ques15),
            getResources().getString(R.string.ques16),getResources().getString(R.string.ques17),
            getResources().getString(R.string.ques18),getResources().getString(R.string.ques19),getResources().getString(R.string.ques20),getResources().getString(R.string.ques21),getResources().getString(R.string.ques22),getResources().getString(R.string.ques23),
            getResources().getString(R.string.ques24),getResources().getString(R.string.ques25)
    };
    private String[] point1 = {getResources().getString(R.string.ques1_point1),getResources().getString(R.string.ques2_point1),getResources().getString(R.string.ques3_point1),getResources().getString(R.string.ques4_point1),getResources().getString(R.string.ques5_point1),
            getResources().getString(R.string.ques6_point1),getResources().getString(R.string.ques7_point1)
            ,getResources().getString(R.string.ques8_point1), getResources().getString(R.string.ques9_point1),getResources().getString(R.string.ques10_point1),
            getResources().getString(R.string.ques11_point1),getResources().getString(R.string.ques12_point1),getResources().getString(R.string.ques13_point1),
            getResources().getString(R.string.ques14_point1),getResources().getString(R.string.ques15_point1),
            getResources().getString(R.string.ques16_point1),getResources().getString(R.string.ques16_point1),
            getResources().getString(R.string.ques16_point1),getResources().getString(R.string.ques16_point1),
            getResources().getString(R.string.ques16_point1), getResources().getString(R.string.ques16_point1),
            getResources().getString(R.string.ques16_point1),getResources().getString(R.string.ques16_point1),
            getResources().getString(R.string.ques16_point1),getString(R.string.ques16_point1)
    };

    private String[] point2 = {getResources().getString(R.string.ques1_point2),getResources().getString(R.string.ques2_point2),getResources().getString(R.string.ques3_point2),getResources().getString(R.string.ques4_point2),
            getResources().getString(R.string.ques5_point2), getResources().getString(R.string.ques6_point2),getResources().getString(R.string.ques7_point2),getResources().getString(R.string.ques8_point2),
            getResources().getString(R.string.ques9_point2),getResources().getString(R.string.ques10_point2),getResources().getString(R.string.ques11_point2),getResources().getString(R.string.ques12_point2),getResources().getString(R.string.ques13_point2),getResources().getString(R.string.ques14_point2),
            getResources().getString(R.string.ques15_point2),getResources().getString(R.string.ques16_point2),getResources().getString(R.string.ques16_point2),
            getResources().getString(R.string.ques16_point2),getResources().getString(R.string.ques16_point2),getResources().getString(R.string.ques16_point2),getResources().getString(R.string.ques16_point2),
            getResources().getString(R.string.ques16_point2),getResources().getString(R.string.ques16_point2),
            getResources().getString(R.string.ques16_point2),getResources().getString(R.string.ques16_point2)
    };
    private String[] point3 = { getString(R.string.ques1_point3),getString(R.string.ques2_point3),getString(R.string.ques3_point3),
            getString(R.string.ques4_point3),getString(R.string.ques5_point3), getString(R.string.ques6_point3),getString(R.string.ques7_point3),
            getString(R.string.ques8_point3),getString(R.string.ques9_point3),getString(R.string.ques10_point3),
            getString(R.string.ques11_point3),getString(R.string.ques12_point3),getString(R.string.ques13_point3),
            getString(R.string.ques14_point3),getString(R.string.ques15_point3),"","","","","","","","","",""
    };
    private String[] point4 = {getString(R.string.ques1_point4),getString(R.string.ques2_point4),getString(R.string.ques3_point4),getString(R.string.ques4_point4),
            getString(R.string.ques5_point4), getString(R.string.ques6_point4),getString(R.string.ques7_point4),getString(R.string.ques8_point4),
            getString(R.string.ques9_point4),getString(R.string.ques10_point4), getString(R.string.ques11_point4),
            getString(R.string.ques12_point4),getString(R.string.ques13_point4),getString(R.string.ques14_point4),getString(R.string.ques15_point4),"","","","","","","","","",""
    };*/
    private RadioGroup group1,group2,group3,group4,group5,group6,group7,group8,group9,group10,group11,group12,group13,group14,group15,group16,group17,group18,group19,group20,group21,group22,group23,group24,group25;
    private AppCompatButton submitBtn;
    private boolean sent = false;

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

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques1),String.valueOf(radioButton.getText())));
            }
        });

        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques2),String.valueOf(radioButton.getText())));
            }
        });

        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques3),String.valueOf(radioButton.getText())));
            }
        });

        group4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques4),String.valueOf(radioButton.getText())));
            }
        });

        group5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques5),String.valueOf(radioButton.getText())));
            }
        });

        group6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques6),String.valueOf(radioButton.getText())));
            }
        });

        group7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques7),String.valueOf(radioButton.getText())));
            }
        });

        group8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques8),String.valueOf(radioButton.getText())));            }
        });

        group9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques9),String.valueOf(radioButton.getText())));
            }
        });

        group10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques10),String.valueOf(radioButton.getText())));
            }
        });

        group11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques11),String.valueOf(radioButton.getText())));
            }
        });

        group12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques12),String.valueOf(radioButton.getText())));
            }
        });

        group13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques13),String.valueOf(radioButton.getText())));
            }
        });

        group14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques14),String.valueOf(radioButton.getText())));
            }
        });

        group15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques15),String.valueOf(radioButton.getText())));
            }
        });

        group16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques16),String.valueOf(radioButton.getText())));
            }
        });

        group17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques17),String.valueOf(radioButton.getText())));
            }
        });

        group18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques18),String.valueOf(radioButton.getText())));
            }
        });

        group19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques19),String.valueOf(radioButton.getText())));
            }
        });

        group20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques20),String.valueOf(radioButton.getText())));
            }
        });

        group21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques21),String.valueOf(radioButton.getText())));
            }
        });

        group22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques22),String.valueOf(radioButton.getText())));
            }
        });

        group23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques23),String.valueOf(radioButton.getText())));
            }
        });

        group24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques24),String.valueOf(radioButton.getText())));
            }
        });
        group25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                questionListModels.add(new QuestionListModel(getString(R.string.ques25),String.valueOf(radioButton.getText())));
            }
        });
      /*  for (int i = 0; i < questions.length; i++){
            QuestionListModel model = new QuestionListModel(questions[i],point1[i],point2[i],point3[i],point4[i]);
            questionListModels.add(model);
        }


        QuestionsItemAdapter adapter = new QuestionsItemAdapter(MainActivity.this,questionListModels);
        recyclerView.setAdapter(adapter);*/

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (questionListModels.size() > 0){
                  /*Intent intent = new Intent(Intent.ACTION_SENDTO);
                  intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"kainatkhan1546@gmail.com"});
                  intent.putExtra(Intent.EXTRA_SUBJECT, "Abc");
                  intent.putExtra(Intent.EXTRA_TEXT, "Hello");

                 // intent.setType("text/plain");
                  //start your intent
                  intent.setData(Uri.parse("mailto:"));

                  if (intent.resolveActivity(getPackageManager()) != null) {
                      //startActivity(Intent.createChooser(intent, "Select your Email app"));
                      startActivity(intent);
                      startActivity(new Intent(MainActivity.this, ItemsActivity.class));
                      finish();

                      Toast.makeText(MainActivity.this, "Email Sent!",
                              Toast.LENGTH_SHORT).show();
                  } else {
                      Toast.makeText(MainActivity.this, "There is no application that support this action",
                              Toast.LENGTH_SHORT).show();
                  }*/

                  String to = "0533665281kamar@gmail.com";
                //  String to = "kainatkhan1546@gmail.com";
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

                  startActivity(Intent.createChooser(email, "Choose an Email client :"));
                  sent = true;
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
            startActivity(new Intent(MainActivity.this, ItemsActivity.class));
            finish();
            Toast.makeText(MainActivity.this, "Email Sent", Toast.LENGTH_SHORT).show();
        }
    }
}