package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button btnlogin, admin;
    DBHelper DB;
    InfoClass IC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        btnlogin = (Button) findViewById(R.id.btnsignin1);
        admin = (Button) findViewById(R.id.btnadmin);

        DB = new DBHelper(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("") || pass.equals(""))
                    Toast.makeText(LoginActivity.this, "Please Enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    if (user.equals("Admin")) {
                        if(pass.equals("admin")){
                            IC = new InfoClass(user);
                            Toast.makeText(LoginActivity.this, "Sign in successfully!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(LoginActivity.this, "Wrong Username or Password! Please try again!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                        if (checkuserpass) {
                            IC = new InfoClass(user);
                            Toast.makeText(LoginActivity.this, "Sign in successfully!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass= password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(LoginActivity.this,"Please Enter all the fields", Toast.LENGTH_SHORT).show();
                else{

                    if(user.equals("Admin") && pass.equals("admin")){
                        Toast.makeText(LoginActivity.this,"Sign in successfully!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(LoginActivity.this,"Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}