package com.example.kub.sportech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.InputMismatchException;


public class SignUpActivity extends AppCompatActivity
      {
    private String userAgeFromSpinner;
    private static final String TAG = "EmailPassword";
    private EditText mEmailSignUpField;
    private EditText mPasswordSignUpField;
 private DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
   private DatabaseReference mUserRef = myRef.child("users");
    private EditText mNameSignUpField;
    private EditText mGenderSignUpField;
    private EditText mPhotoSignUpField;
    private Spinner mAgeSignUpSpinner;
    private Button kayit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        mEmailSignUpField = (EditText) findViewById(R.id.signup_field_email);
        mPasswordSignUpField = (EditText) findViewById(R.id.signup_field_password);
        mPhotoSignUpField = (EditText) findViewById(R.id.photo_sign_up_from_editview);

        mGenderSignUpField = (EditText) findViewById(R.id.gender_sign_up_from_editview);
        mAgeSignUpSpinner = (Spinner) findViewById(R.id.age_sign_up_form_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.age_sign_up_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mAgeSignUpSpinner.setAdapter(adapter);
        kayit = (Button) findViewById(R.id.sign_up_button);
        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    User u = new User();

                    u.email = mEmailSignUpField.getText().toString();
                    u.password = mPasswordSignUpField.getText().toString();
                    u.photo = mPhotoSignUpField.getText().toString();
                    //u.age=mAgeSignUpSpinner.getSelectedItem().toString();
                    u.gender = mGenderSignUpField.getText().toString();
                    mUserRef.push().setValue(u);
                    Toast.makeText(getApplicationContext(), "Kayıt oldunuz", Toast.LENGTH_LONG).show();

                }
                catch(InputMismatchException e) {
                    Toast.makeText(getApplicationContext(), "Kayıt başarısız", Toast.LENGTH_LONG).show();
                }

            }
        });
    }}

