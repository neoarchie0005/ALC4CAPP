package com.atapinno.sc.alc4capp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button mAboutButton;
    Button mMyProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find button1
        mAboutButton = findViewById(R.id.button1);

        //set onclicklistener on button1
        mAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intent
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                aboutIntent.putExtra(AboutActivity.WEBSITE_ADDRESS, "https://andela.com/alc/");
                //start intent
                startActivity(aboutIntent);
            }
        });

        //find button2
        mMyProfileButton = findViewById(R.id.button2);

        //set onlcicklistener on button2
        mMyProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intent
                Intent button2Intent = new Intent(MainActivity.this, MyProfileActivity.class);
                //start intent
                startActivity(button2Intent);
            }
        });

    }
}
