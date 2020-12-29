package vangthao.app.acitivitydemo.parceablesandbundles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import vangthao.app.acitivitydemo.R;

public class SendingDataActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_data);

        vangthao.app.acitivitydemo.databinding.ActivitySendingDataBinding activitySendingDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_sending_data);

        user = new User();
        user.setUserId(1);
        user.setUsername("VangThao");
        user.setEmail("vangthao1905@gmail.com");
        user.setAddress("Lào Cai");
        activitySendingDataBinding.setUser(user);
    }

    public void sendData(View view) {
        Intent intent = new Intent(SendingDataActivity.this, ReceiveDataActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}