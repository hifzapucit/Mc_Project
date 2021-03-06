package com.example.garbagemanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_selection);
    }

    public void UserLogin(View view) {
        Intent intent=new Intent(UserSelection.this,Login.class);
        intent.putExtra("Heading","User Login");
        startActivity(intent);
    }
    public void DriverLogin(View view) {
        Intent intent=new Intent(UserSelection.this,Login.class);
        intent.putExtra("Heading","Driver Login");
        startActivity(intent);
    }

    public void AdminLogin(View view) {
        Intent intent=new Intent(UserSelection.this,Login.class);
        intent.putExtra("Heading","Admin Login");
        startActivity(intent);
    }

    public void userRegister(View view) {
        Intent intent=new Intent(UserSelection.this,UserRegistration.class);
        startActivity(intent);
    }
    public void creatbin(View view) {
        Intent intent=new Intent(getApplicationContext(),CreatBin.class);
        startActivity(intent);
    }

    public void creatdriver(View view) {
        Intent intent=new Intent(getApplicationContext(),CreatDriver.class);
        startActivity(intent);
    }

    public void viewbin(View view) {
        Intent intent=new Intent(getApplicationContext(),ViewBin.class);
        startActivity(intent);
    }

    public void viewdriver(View view) {
        Intent intent=new Intent(getApplicationContext(),ViewDriver.class);
        startActivity(intent);
    }
}

