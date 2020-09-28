package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    String string_result;
    TextView textView_resultName;
    TextView textView_resultAge;
    TextView textView_resultEmail;
    Intent intent;
    User user;
    Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        textView_resultName = findViewById(R.id.result_nameId);
        textView_resultAge = findViewById(R.id.result_ageId);
        textView_resultEmail = findViewById(R.id.result_emailId);
        intent = getIntent();
        user = intent.getParcelableExtra("user");
        
        textView_resultName.setText("Je m'appelle "+user.getName());
        textView_resultAge.setText("J'ai "+user.getAge()+" ans");
        textView_resultEmail.setText("Mon adresse mail est "+user.getEmail());

        button = findViewById(R.id.button_retour);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        finish();//finishing activity
                    }
                });

    }
}
