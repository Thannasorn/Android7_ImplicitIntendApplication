package com.thannasorn.implicitintendapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        backBtn = (Button) findViewById(R.id.backButton);
        backBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}