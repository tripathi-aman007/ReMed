package com.example.remed4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://remed-dbbb6-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText full_name = findViewById(R.id.fullName);
        final EditText e_mail = findViewById(R.id.email);
        final EditText phone = findViewById(R.id.phone);
        final EditText password = findViewById(R.id.password);
        final EditText re_password = findViewById(R.id.re_password);

        final Button registerBtn = (Button) findViewById(R.id.register_btn);
        final Button loginNowBtn = (Button) findViewById(R.id.loginNow);

       registerBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               final String fullNameText = full_name.getText().toString();
               final String emailText = e_mail.getText().toString();
               final String phoneText = phone.getText().toString();
               final String passwordText = password.getText().toString();
               final String rePassword = re_password.getText().toString();

               if(fullNameText.isEmpty() || emailText.isEmpty() || phoneText.isEmpty() || passwordText.isEmpty()) {
                   Toast.makeText(Register.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
               } else if(!passwordText.equals(rePassword)) {
                   Toast.makeText(Register.this, "Passwords are not matching", Toast.LENGTH_SHORT).show();
               } else {
                   databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                       @Override
                       public void onDataChange(@NonNull DataSnapshot snapshot) {
                           if(snapshot.hasChild(phoneText)) {
                               Toast.makeText(Register.this, "Phone is already registered", Toast.LENGTH_SHORT).show();
                           } else {
                               databaseReference.child("users").child(phoneText).child("fullName").setValue(fullNameText);
                               databaseReference.child("users").child(phoneText).child("email").setValue(emailText);
                               databaseReference.child("users").child(phoneText).child("password").setValue(passwordText);

                               Toast.makeText(Register.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
                               startActivity(new Intent(Register.this, LoginActivity.class));
                               finish();
                           }
                       }

                       @Override
                       public void onCancelled(@NonNull DatabaseError error) {}
                   });
               }
           }
       });

        loginNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this, LoginActivity.class));
                finish();
            }
        });
    }
}