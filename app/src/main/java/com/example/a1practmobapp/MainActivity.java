package com.example.a1practmobapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText textName, textEmail;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textName = findViewById(R.id.text_name);
        textEmail = findViewById(R.id.text_email);
        buttonLogin = findViewById(R.id.button_login);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = textName.getText().toString();
                String email = textEmail.getText().toString();


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("name", name);
                intent.putExtra("email", email);


                startActivity(intent);
            }
        });
    }
}
