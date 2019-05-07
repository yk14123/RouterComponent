package com.chinafocus.mycomponent;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chinafocus.myrouterlib.AppConfig;
import com.chinafocus.myrouterlib.IAppComponent;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public class MainApp extends Application implements IAppComponent {

    private static MainApp sApplication;

    public static Application getApplication(){
        return sApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);

        if (BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    @Override
    public void initialize(Application application) {
        sApplication = (MainApp) application;

        for (String temp: AppConfig.COMPONENTS_APP){
            try {
                Class clazz = Class.forName(temp);
                Object instance = clazz.newInstance();
                if (instance instanceof IAppComponent){
                    ((IAppComponent) instance).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
