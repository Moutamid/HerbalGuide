package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class EntryActivity extends AppCompatActivity {

    Button entry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        entry = findViewById(R.id.entryBtn);

        entry.setOnClickListener(v -> {
            startActivity(new Intent(this, ItemsActivity.class));
        });

    }
}