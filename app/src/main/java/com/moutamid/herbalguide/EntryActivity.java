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
import android.widget.TextView;
import android.widget.Toast;

public class EntryActivity extends AppCompatActivity {

    AppCompatButton entry;
    EditText email, password;
    ProgressDialog progressDialog;
    TextView registerNow;
    private ImageView backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        entry = findViewById(R.id.entryBtn);
        email = findViewById(R.id.emailNumber);
        password = findViewById(R.id.password);
        registerNow = findViewById(R.id.registerNow);

        progressDialog = new ProgressDialog(EntryActivity.this);
        progressDialog.setMessage("تسجيل الدخول");
        backImg = findViewById(R.id.back);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SplashScreenActivity.class));
                finish();
            }
        });
        registerNow.setOnClickListener(v -> {
            startActivity(new Intent(this, RegisterActivity.class));
        });

        entry.setOnClickListener(v -> {
            if (validate()){
                if (isEmailValid(email.getText().toString())){
                    progressDialog.show();
                    Constants.auth().signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                            .addOnSuccessListener(authResult -> {
                                progressDialog.dismiss();
                                startActivity(new Intent(this, ItemsActivity.class));
                                finish();
                            })
                            .addOnFailureListener(e -> {
                                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            });
                }
            }
        });

    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean validate() {
        if (email.getText().toString().isEmpty()){
            email.setError("مطلوب*");
            return false;
        } if (password.getText().toString().isEmpty()){
            password.setError("مطلوب*");
            return false;
        }
        return true;
    }
}