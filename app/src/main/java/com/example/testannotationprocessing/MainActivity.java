package com.example.testannotationprocessing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.annotationsample.Navigator;
import com.example.my_annotations.NewIntent;

@NewIntent
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Navigator.startSecondActivity(this);


//        Navigator.startMainActivity(this);
    }
}
