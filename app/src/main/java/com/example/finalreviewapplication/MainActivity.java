package com.example.finalreviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView mytext = findViewById(R.id.mytextview);
       Button myButton = findViewById(R.id.mybutton);

       myButton.setOnClickListener( ( vm ) -> mytext.setText("You click the button"));


        CheckBox myCheck = findViewById(R.id.thecheckbox);
        myCheck.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Context context = getApplicationContext();
            CharSequence text = "Nice Choice!";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        });

        CheckBox myCheck2 = findViewById(R.id.thecheckbox2);
        myCheck2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Context context = getApplicationContext();
            CharSequence text = "Also Nice Choice!";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        });






    }
}