package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ThankYouActivity extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        back = findViewById(R.id.back);

        back.setOnClickListener(v -> {
            startActivity(new Intent(this, ItemsActivity.class));
            finish();
        });
    }
}