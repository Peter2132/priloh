package com.example.a1practmobapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private static final int REQUEST_CODE_SETTINGS = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");


        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewWelcome = findViewById(R.id.textViewWelcome);


        textViewName.setText(name);
        textViewEmail.setText(email);
        textViewWelcome.setText("Добро пожаловать!");
    }

    public void onClick2(android.view.View view) {

        Intent intent = new Intent(this, MainActivity3.class);
        startActivityForResult(intent, REQUEST_CODE_SETTINGS);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_SETTINGS && resultCode == RESULT_OK) {

            String newName = data.getStringExtra("name");
            String newEmail = data.getStringExtra("email");


            TextView textViewName = findViewById(R.id.textViewName);
            TextView textViewEmail = findViewById(R.id.textViewEmail);

            textViewName.setText(newName);
            textViewEmail.setText(newEmail);
        }
    }
}
