package com.example.aob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityforgotpassword extends AppCompatActivity {
  EditText edtusernameforpass,edtemail,edtcode,edtsetpassword;
  Button butverify,butgetcode,butsetpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityforgotpassword);
        edtusernameforpass=findViewById(R.id.edtusernameforpass);
        edtemail=findViewById(R.id.edtemail);
        edtcode=findViewById(R.id.edtcode);
        edtsetpassword=findViewById(R.id.edtsetpassword);
        butverify=findViewById(R.id.butverify);
        butgetcode=findViewById(R.id.butgetcode);
        butsetpassword=findViewById(R.id.butsetpassword);
        edtsetpassword.setVisibility(View.GONE);
        edtcode.setVisibility(View.GONE);
        butverify.setVisibility(View.GONE);
        butsetpassword.setVisibility(View.GONE);

        butgetcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtusernameforpass.getText().toString().isEmpty()||edtemail.getText().toString().isEmpty()){
                    Toast.makeText(MainActivityforgotpassword.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivityforgotpassword.this, "Code has been sent to your email id", Toast.LENGTH_SHORT).show();
                   edtcode.setVisibility(View.VISIBLE);
                   butverify.setVisibility(View.VISIBLE);
                }
            }
        });

        butverify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtusernameforpass.getText().toString().isEmpty()||edtemail.getText().toString().isEmpty()||edtcode.getText().toString().isEmpty()){
                    Toast.makeText(MainActivityforgotpassword.this, "Please enter all the fields!!", Toast.LENGTH_SHORT).show();
                }
                else{
                  edtsetpassword.setVisibility(View.VISIBLE);
                  butsetpassword.setVisibility(View.VISIBLE);
                }
            }
        });

        butsetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtsetpassword.getText().toString().isEmpty()){
                    Toast.makeText(MainActivityforgotpassword.this, "New password field cannot be empty!!", Toast.LENGTH_SHORT).show();
                }
                else  if(edtsetpassword.getText().toString().length()<8){
                    Toast.makeText(MainActivityforgotpassword.this, "New password should atleast have 8 characters!! ", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivityforgotpassword.this, "Password has been updated!!", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivityforgotpassword.this,com.example.aob.MainActivity.class);
                    startActivity(i);
                    MainActivityforgotpassword.this.finish();
                }
            }
        });
    }
}