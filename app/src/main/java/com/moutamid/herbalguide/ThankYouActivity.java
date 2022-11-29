package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ThankYouActivity extends AppCompatActivity {

    AppCompatButton back;
    private ImageView backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        back = findViewById(R.id.back);
        backImg = findViewById(R.id.backBtn);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ItemsActivity.class));
                finish();
            }
        });
        back.setOnClickListener(v -> {
            startActivity(new Intent(this, ItemsActivity.class));
            finish();
        });
    }
}