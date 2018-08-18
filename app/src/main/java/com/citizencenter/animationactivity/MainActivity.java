package com.citizencenter.animationactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecondActivity(View view) {
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}
