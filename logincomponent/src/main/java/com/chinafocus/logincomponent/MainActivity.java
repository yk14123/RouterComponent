package com.chinafocus.logincomponent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.chinafocus.myrouterlib.AppConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_component_activity_main);

        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(AppConfig.LOGIN_TARGET);
            if (stringExtra == null){
                stringExtra = "主MainApp没有传数据，现在是我独立开发";
            }
            Toast.makeText(this, "From Main : " + stringExtra, Toast.LENGTH_SHORT).show();
        }
    }
}
