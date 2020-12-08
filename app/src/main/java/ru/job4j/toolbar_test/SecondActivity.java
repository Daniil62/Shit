package ru.job4j.toolbar_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        toolbar = findViewById(R.id.toolbar);
        setToolbar();
        ImageButton button = findViewById(R.id.second_imageButton);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });
    }
    private void setToolbar() {
        Intent intent = getIntent();
        if (toolbar != null) {
            if (intent != null) {
                toolbar.setTitle("SECOND ACTIVITY");
            }
            setSupportActionBar(toolbar);
        }
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
