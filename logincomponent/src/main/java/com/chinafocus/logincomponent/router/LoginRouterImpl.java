package com.chinafocus.logincomponent.router;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.chinafocus.logincomponent.LoginFragment;
import com.chinafocus.logincomponent.MainActivity;
import com.chinafocus.myrouterlib.AppConfig;
import com.chinafocus.myrouterlib.router.ILoginRouter;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public class LoginRouterImpl implements ILoginRouter {

    @Override
    public void launch(Context context, String target) {
        Intent intent = new Intent(context,MainActivity.class);
        intent.putExtra(AppConfig.LOGIN_TARGET,target);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment addLoginFragment(FragmentManager fm, int viewId, Bundle bundle){
            Fragment fragment = new LoginFragment();
            fragment.setArguments(bundle);
            fm.beginTransaction().add(viewId,fragment,"login_fragment_one").commit();
            return fragment;
    }

}
