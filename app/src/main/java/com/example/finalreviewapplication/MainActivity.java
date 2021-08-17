package com.example.finalreviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
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
            int duration = Toast.LENGTH_SHORT;

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

        Switch myswitch = findViewById(R.id.myswitch);
        myswitch.setOnCheckedChangeListener((switchView,isChecked) ->{
            Context context = getApplicationContext();
            CharSequence text = "Turn on the light!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        });

        RadioButton myRadioBut = findViewById(R.id.myradiobutton);
        myRadioBut.setOnCheckedChangeListener((v,isChecked) ->{
            Context context = getApplicationContext();
            CharSequence text = "I like walk!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        });

        RadioButton myRadioBut2 = findViewById(R.id.myradiobutton2);
        myRadioBut2.setOnCheckedChangeListener((v,isChecked) ->{
            Context context = getApplicationContext();
            CharSequence text = "I like drive!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        });


        ImageButton imageButton = findViewById(R.id.myImageButton);

        imageButton.setOnClickListener((m) ->{
            int width = imageButton.getWidth();
            int height = imageButton.getHeight();
            Toast.makeText(getApplicationContext(),"The width = " + width + " and height = " + height,
                    Toast.LENGTH_LONG).show();
        });






    }
}