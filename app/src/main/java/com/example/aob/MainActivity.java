package com.example.aob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText edtusername,edtpassword;
  Button butlogin,butforgotpassword,butsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    edtusername=findViewById(R.id.edtusername);
        edtpassword=findViewById(R.id.edtpassword);
        butlogin=findViewById(R.id.butlogin);
        butforgotpassword=findViewById(R.id.butforgotpassword);
        butsignup=findViewById(R.id.butsignup);

        butlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           if(edtusername.getText().toString().isEmpty()||edtpassword.getText().toString().isEmpty()){
               Toast.makeText(MainActivity.this, "Please enter all fields!!", Toast.LENGTH_SHORT).show();
           }
           else{
               Intent i=new Intent(MainActivity.this,com.example.aob.MainActivityapp.class);
               startActivity(i);
           }
            }
        });

        butforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         Intent i=new Intent(MainActivity.this,com.example.aob.MainActivityforgotpassword.class);
                startActivity(i);
            }
        });

        butsignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
           Intent i=new Intent(MainActivity.this,com.example.aob.MainActivitysignup.class);
                startActivity(i);
            }
        });
    }
}