package com.moutamid.herbalguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.moutamid.herbalguide.model.QuestionListModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<QuestionListModel> questionListModels = new ArrayList<>();
    public static final int REQUEST_CODE_MAIL = 1000;
    private RadioGroup agroup1, agroup2, agroup3, agroup4, agroup5, agroup6, agroup7, agroup8, agroup9,
            agroup10, agroup11, agroup12, agroup13, agroup14, agroup15, agroup16, agroup17, agroup18,
            agroup19, agroup20, agroup21, agroup22, agroup23, agroup24, agroup25;

    private AppCompatButton submitBtn;
    private boolean sent = false;
    int aselectedId1, aselectedId2, aselectedId3, aselectedId4, aselectedId5, aselectedId6,
            aselectedId7, aselectedId8, aselectedId9, aselectedId10, aselectedId11, aselectedId12,
            aselectedId13, aselectedId14, aselectedId15, aselectedId16, aselectedId17, aselectedId18,
            aselectedId19, aselectedId20, aselectedId21, aselectedId22, aselectedId23, aselectedId24,
            aselectedId25 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  recyclerView = findViewById(R.id.recyclerView);
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
                if (aselectedId1 != 0 && aselectedId2 != 0 && aselectedId3 != 0 && aselectedId4 != 0 && aselectedId5 != 0 &&
                        aselectedId6 != 0 && aselectedId7 != 0 && aselectedId8 != 0 && aselectedId9 != 0 && aselectedId10 != 0 &&
                        aselectedId11 != 0 && aselectedId12 != 0 && aselectedId13 != 0 && aselectedId14 != 0 && aselectedId15 != 0 &&
                        aselectedId16 != 0 && aselectedId17 != 0 && aselectedId18 != 0 && aselectedId19 != 0 && aselectedId20 != 0 &&
                        aselectedId21 != 0 && aselectedId22 != 0 && aselectedId23 != 0
                        && aselectedId24 != 0 && aselectedId25 != 0) {
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
                        Toast.makeText(MainActivity.this, "Couldn't find an email app and account", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Please Answer these Questions", Toast.LENGTH_SHORT).show();
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