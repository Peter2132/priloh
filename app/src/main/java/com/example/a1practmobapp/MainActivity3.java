package com.example.a1practmobapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        Button buttonSave = findViewById(R.id.buttonSave);


        buttonSave.setOnClickListener(view -> {

            String newName = editTextName.getText().toString();
            String newEmail = editTextEmail.getText().toString();


            Intent intent = new Intent();

            intent.putExtra("name", newName);
            intent.putExtra("email", newEmail);


            setResult(RESULT_OK, intent);


            finish();
        });
    }


}
