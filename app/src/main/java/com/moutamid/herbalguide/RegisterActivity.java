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
import android.widget.Toast;

import com.moutamid.herbalguide.model.UserModel;

public class RegisterActivity extends AppCompatActivity {

    AppCompatButton registerBtn;
    UserModel userModel;
    EditText nameEt, familyEt, emailNumber, password, functionEt;
    ProgressDialog progressDialog;
    private ImageView backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerBtn = findViewById(R.id.registerBtn);
        nameEt = findViewById(R.id.nameEt);
        familyEt = findViewById(R.id.familyEt);
        emailNumber = findViewById(R.id.emailNumber);
        password = findViewById(R.id.password);
        functionEt = findViewById(R.id.functionEt);

        progressDialog = new ProgressDialog(RegisterActivity.this);
        progressDialog.setMessage("إنشاء حسابك");

        backImg = findViewById(R.id.back);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SplashScreenActivity.class));
                finish();
            }
        });

        registerBtn.setOnClickListener(v -> {
            if (validate()){
                if (isEmailValid(emailNumber.getText().toString())){
                    progressDialog.show();
                    Constants.auth().createUserWithEmailAndPassword(
                            emailNumber.getText().toString(),
                            password.getText().toString()
                    ).addOnSuccessListener(authResult -> {
                        userModel = new UserModel(
                                nameEt.getText().toString(),
                                familyEt.getText().toString(),
                                emailNumber.getText().toString(),
                                password.getText().toString(),
                                functionEt.getText().toString()
                        );
                       Constants.databaseReference().child("users")
                               .child(Constants.auth().getCurrentUser().getUid())
                               .setValue(userModel).addOnSuccessListener(unused -> {
                                   progressDialog.dismiss();
                                   startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                                    finish();
                               }).addOnFailureListener(e -> {
                                   progressDialog.dismiss();
                                   Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                               });
                    }).addOnFailureListener(e -> {
                        progressDialog.dismiss();
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
        if (nameEt.getText().toString().isEmpty()){
            nameEt.setError("مطلوب*");
            return false;
        } if (familyEt.getText().toString().isEmpty()){
            familyEt.setError("مطلوب*");
            return false;
        } if (emailNumber.getText().toString().isEmpty()){
            emailNumber.setError("مطلوب*");
            return false;
        } if (password.getText().toString().isEmpty()){
            password.setError("مطلوب*");
            return false;
        } if (functionEt.getText().toString().isEmpty()){
            functionEt.setError("مطلوب*");
            return false;
        }
        return true;
    }

}