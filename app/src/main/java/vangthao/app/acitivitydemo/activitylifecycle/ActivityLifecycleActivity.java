package vangthao.app.acitivitydemo.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import vangthao.app.acitivitydemo.R;

public class ActivityLifecycleActivity extends AppCompatActivity {

    private TextView txtMyText;
    private EditText edtNewText;
    private String textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d("Activity", "onCreate is called!");
        if (savedInstanceState != null) {
            textResult = savedInstanceState.getString("myText", "NO TEXT");
        } else {
            textResult = "Default text";
        }
        txtMyText = findViewById(R.id.txtMyText);
        edtNewText = findViewById(R.id.edtNewText);
        txtMyText.setText(textResult);
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
    protected void onPause() {
        super.onPause();
        Log.d("Activity", "onPause called!");
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

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "Saved called!", Toast.LENGTH_SHORT).show();
        outState.putString("myText", txtMyText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textResult = savedInstanceState.getString("myText", "NO TEXT");
    }

    public void changeText(View view) {
        txtMyText.setText(edtNewText.getText().toString());
    }
}