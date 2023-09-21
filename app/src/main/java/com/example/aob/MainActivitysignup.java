package com.example.aob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitysignup extends AppCompatActivity {
EditText edtusernameforsignup,edtemailforsignup,edtpasswordforsignup;
Button butsignupconfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitysignup);
        edtusernameforsignup=findViewById(R.id.edtusernameforsignup);
        edtemailforsignup=findViewById(R.id.edtemailforsignup);
        edtpasswordforsignup=findViewById(R.id.edtpasswordforsignup);
        butsignupconfirm=findViewById(R.id.butsignupconfirm);

     butsignupconfirm.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if(edtusernameforsignup.getText().toString().isEmpty()||edtpasswordforsignup.getText().toString().isEmpty()||edtemailforsignup.getText().toString().isEmpty()){
                 Toast.makeText(MainActivitysignup.this, "Please enter all fields!!", Toast.LENGTH_SHORT).show();
             }
             else if(edtpasswordforsignup.getText().toString().length()<8){
                 Toast.makeText(MainActivitysignup.this, "Password should atleast have 8 characters ", Toast.LENGTH_SHORT).show();
             }
             else {
                 Toast.makeText(MainActivitysignup.this, "Thankyou!! You have successfully registered;", Toast.LENGTH_SHORT).show();
                 Intent i=new Intent(MainActivitysignup.this,com.example.aob.MainActivityapp.class);
              startActivity(i);
              MainActivitysignup.this.finish();
             }
         }
     });
    }
}