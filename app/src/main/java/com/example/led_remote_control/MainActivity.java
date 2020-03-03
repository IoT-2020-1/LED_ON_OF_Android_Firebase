package com.example.led_remote_control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("led-on-off-7ac0f");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("test");
    }

    public void onClickON(View v) {
        Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_LONG).show();
        myRef.setValue("true");
        System.out.println("true");

    }

    public  void onClickOFF(View v) {


    }
}
