package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    EditText editTextNom, editTextAge, editTextEmail;
    Button button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNom = (EditText)findViewById(R.id.EditTextNomId);
        editTextAge = (EditText)findViewById(R.id.EditTextAgeId);
        editTextEmail = (EditText)findViewById(R.id.EditTextEmailId);
        button = (Button)findViewById(R.id.button_envoyer);

        intent = new Intent(getBaseContext(),Result.class);
        button.setOnClickListener(
            new View.OnClickListener()
            {
                public void onClick(View view)
                {
                    intent.putExtra("user", (Parcelable) new User(editTextNom.getText().toString(), editTextAge.getText().toString(), editTextEmail.getText().toString()));
                    startActivityForResult(intent, 2);
                }
            });
    }
}