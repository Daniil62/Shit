package ru.job4j.toolbar_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class ThirdActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        toolbar = findViewById(R.id.third_toolbar);
        setToolbar();
    }
    private void setToolbar() {
        Intent intent = getIntent();
        if (toolbar != null) {
            if (intent != null) {
                toolbar.setTitle("THIRD ACTIVITY");
            }
            setSupportActionBar(toolbar);
        }
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
