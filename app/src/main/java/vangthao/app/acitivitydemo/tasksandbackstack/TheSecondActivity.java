package vangthao.app.acitivitydemo.tasksandbackstack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import vangthao.app.acitivitydemo.R;

public class TheSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openTheThirdActivity(View view) {
        Intent theThirdActivityIntent = new Intent(TheSecondActivity.this, TheThirdActivity.class);
        startActivity(theThirdActivityIntent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}