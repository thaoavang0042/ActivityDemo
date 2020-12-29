package vangthao.app.acitivitydemo.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import vangthao.app.acitivitydemo.R;

public class ActivityLifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d("Activity","onCreate is called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity", "onStart called!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity", "onRestart called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity", "onResume called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity", "onStop called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity", "onDestroy called!");
    }

    public void openSecondActivity(View view) {
        Intent openSecondActivityIntent = new Intent(ActivityLifecycleActivity.this, SecondActivity.class);
        startActivity(openSecondActivityIntent);
    }

    public void exitActivity(View view) {
        finish();
    }
}