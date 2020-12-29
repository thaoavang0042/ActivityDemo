package vangthao.app.acitivitydemo.tasksandbackstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import vangthao.app.acitivitydemo.R;

public class TheFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_first);
    }

    public void openTheSecondActivity(View view) {
        Intent theSecondActivityIntent = new Intent(TheFirstActivity.this, TheSecondActivity.class);
        startActivity(theSecondActivityIntent);
    }
}