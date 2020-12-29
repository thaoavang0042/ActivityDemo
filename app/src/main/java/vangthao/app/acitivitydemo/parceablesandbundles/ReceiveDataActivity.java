package vangthao.app.acitivitydemo.parceablesandbundles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import vangthao.app.acitivitydemo.R;
import vangthao.app.acitivitydemo.databinding.ActivityReceiveDataBinding;

public class ReceiveDataActivity extends AppCompatActivity {

    ActivityReceiveDataBinding mActivityReceiveDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_data);

        mActivityReceiveDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_receive_data);

        Bundle data = getIntent().getExtras();
        User user = (User) data.getParcelable("user");

        if (user != null) {
            Toast.makeText(this, "Send data success!", Toast.LENGTH_SHORT).show();
        } else {
            user = new User(0, "No Username", "No Email", "No Address");
        }
        mActivityReceiveDataBinding.setUser(user);

    }
}