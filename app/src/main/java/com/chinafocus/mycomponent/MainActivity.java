package com.chinafocus.mycomponent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chinafocus.myrouterlib.ILoginExportService;
import com.chinafocus.myrouterlib.router.RouterFactory;

public class MainActivity extends AppCompatActivity {

    private Fragment mFragment;

    @Autowired(name = "/login/loginService")
    ILoginExportService mLoginService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_component_activity_main);

        ARouter.getInstance().inject(this);

        findViewById(R.id.bt_main_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                RouterFactory.getInstance().getLoginRouter().launch(MainActivity.this, "abc");
                if (mLoginService != null)
                    Toast.makeText(MainActivity.this, mLoginService.sayHello("abc"), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //    public void startLogin(View view) {
//        RouterFactory.getInstance().getLoginRouter().launch(MainActivity.this,"abc");
//    }
//
    public void startMine(View view) {
//        RouterFactory.getInstance().getMineRouter().launch(MainActivity.this,"mine");

//        ARouter.getInstance().build("/login/loginSecond")
//                .withInt("abc",123)
//                .navigation();

        ARouter.getInstance().build("/login/loginSecond")
                .withInt("abc", 123)
                .navigation(MainActivity.this, new NavigationCallback() {
                    // 找到了页面后，每次都会调用。没有找到页面不调用
                    @Override
                    public void onFound(Postcard postcard) {
                        Log.e("ARouter", "onFound");
                    }

                    // 没有找到页面，跳转的页面错误的时候调用
                    @Override
                    public void onLost(Postcard postcard) {
                        Log.e("ARouter", "onLost");
                    }

                    // 找到页面，并且成功跳转的回调
                    @Override
                    public void onArrival(Postcard postcard) {
                        Log.e("ARouter", "成功到达onArrival");
                    }

                    // 找到页面，被拦截的回调
                    @Override
                    public void onInterrupt(Postcard postcard) {
                        Log.e("ARouter", "被拦截了onInterrupt");
                    }
                });

    }

    public void loginFragment(View view) {
        if (mFragment == null) {
            Bundle bundle = new Bundle();
            bundle.putString("fragment", "fragment one");
            mFragment = RouterFactory.getInstance().getLoginRouter().addLoginFragment(getSupportFragmentManager(), R.id.fl_container, bundle);
        }
    }
}
