package com.chinafocus.logincomponent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


/**
 * @author
 * @date 2019/5/7
 * description：
 */


@Route(path = "/login/loginSecond")
public class LoginSecondActivity extends AppCompatActivity {

    @Autowired
    int abc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Login SecondActivity");
        setContentView(textView);

        ARouter.getInstance().inject(this);

        Toast.makeText(this, "abc -->" + abc, Toast.LENGTH_SHORT).show();
    }
}
