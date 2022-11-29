package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.google.firebase.auth.FirebaseUser;

public class SplashScreenActivity extends AppCompatActivity {

    private AppCompatButton entryBtn,registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        entryBtn = findViewById(R.id.entry);
        registerBtn = findViewById(R.id.registerBtn);
        entryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashScreenActivity.this, EntryActivity.class));
                finish();
            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashScreenActivity.this, RegisterActivity.class));
                finish();
            }
        });
       /* new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (Constants.auth().getCurrentUser() != null) {
                    startActivity(new Intent(SplashScreenActivity.this, ItemsActivity.class));
                    finish();
                } else {
                    startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                    finish();
                }
            }
        }, 2000);*/
    }

    @Override
    protected void onResume() {
        super.onResume();
        FirebaseUser user = Constants.auth().getCurrentUser();
        if (user !=  null){
            startActivity(new Intent(SplashScreenActivity.this, ItemsActivity.class));
            finish();
        }
    }
}