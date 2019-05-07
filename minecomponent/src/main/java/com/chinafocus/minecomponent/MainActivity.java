package com.chinafocus.minecomponent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.chinafocus.myrouterlib.AppConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mine_component_activity_main);

        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(AppConfig.MINE_TARGET);
        if (stringExtra != null) {
            Toast.makeText(this, "From Main Component == " + stringExtra, Toast.LENGTH_SHORT).show();
        }
    }
}
