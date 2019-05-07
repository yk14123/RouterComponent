package com.chinafocus.logincomponent;

import android.app.Application;

import com.chinafocus.logincomponent.router.LoginRouterImpl;
import com.chinafocus.myrouterlib.IAppComponent;
import com.chinafocus.myrouterlib.router.RouterFactory;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public class LoginApp extends Application implements IAppComponent {

    private static Application sApplication;

    public static Application getApplication() {
        return sApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application application) {
        sApplication =  application;
        RouterFactory.getInstance().setLoginRouter(new LoginRouterImpl());
    }
}
