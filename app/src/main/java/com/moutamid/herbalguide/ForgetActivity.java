package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetActivity extends AppCompatActivity {

    Button entry;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

        entry = findViewById(R.id.entryBtn);
        email = findViewById(R.id.emailNumber);

        entry.setOnClickListener(v -> {
            if (email.getText().toString().isEmpty()){
                Constants.auth().sendPasswordResetEmail(email.getText().toString())
                        .addOnSuccessListener(unused -> {
                            Toast.makeText(this, "Please Check your email", Toast.LENGTH_SHORT).show();
                        }).addOnFailureListener(e -> {
                            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        });
            } else {
                Toast.makeText(this, "Please add your email", Toast.LENGTH_SHORT).show();
            }
        });

    }
}