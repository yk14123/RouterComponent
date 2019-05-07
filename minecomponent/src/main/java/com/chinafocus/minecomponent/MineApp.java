package com.chinafocus.minecomponent;

import android.app.Application;

import com.chinafocus.minecomponent.router.MineRouterImpl;
import com.chinafocus.myrouterlib.IAppComponent;
import com.chinafocus.myrouterlib.router.RouterFactory;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public class MineApp extends Application implements IAppComponent {
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
        sApplication = application;
        RouterFactory.getInstance().setMineRouter(new MineRouterImpl());
    }
}
