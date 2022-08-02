package com.example.bikerental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate MainActivity",
                Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate MainActivity");
    }

    protected void onStart() {
        Toast.makeText(this, "onStart MainActivity",
                Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart MainActivity");
        super.onStart();
    }
    protected void onResume() {
        Toast.makeText(this, "onResume MainActivity",
                Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume MainActivity");
        super.onResume();
    }
    protected void onPause() {
        Toast.makeText(this, "onPause MainActivity",
                Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause MainActivity");
        super.onPause();
    }
    protected void onStop() {
        Toast.makeText(this, "onStop MainActivity",
                Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop MainActivity");
        super.onStop();
    }
    protected void onRestart() {
        Toast.makeText(this, "onRestart MainActivity",
                Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart MainActivity");
        super.onRestart();
    }
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy MainActivity",
                Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy MainActivity");
        super.onDestroy();
    }


    public void handleSelection(View view) {
        Toast.makeText(this, "Bike is tapped", Toast.LENGTH_SHORT).show();
    }
    public void gotoweb(View view) {
      Intent i=new Intent(Intent.ACTION_VIEW , Uri.parse("https://bikeclub.com/?gclid=Cj0KCQjw852XBhC6ARIsAJsFPN16z6udu3k2Pc1zSPRO4H5OIfS8Hokd1F5qIID9Sn1VZWHFTklHSuUaAj55EALw_wcB"));
      startActivity(i);
    }
    }
