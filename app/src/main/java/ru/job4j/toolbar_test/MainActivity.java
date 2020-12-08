package ru.job4j.toolbar_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.main_toolbar);
        setToolbar();
        ImageButton button = findViewById(R.id.imageButton);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
    }
    private void setToolbar() {
        Intent intent = getIntent();
        if (toolbar != null) {
            if (intent != null) {
                toolbar.setTitle("MAIN ACTIVITY");
            }
            setSupportActionBar(toolbar);
        }
    }
}
