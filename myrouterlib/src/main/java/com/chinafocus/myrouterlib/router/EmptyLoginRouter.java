package com.chinafocus.myrouterlib.router;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public class EmptyLoginRouter implements ILoginRouter {
    @Override
    public void launch(Context context, String target) {
        Log.e("EmptyLoginRouter","EmptyLoginRouter");
    }

    @Override
    public Fragment addLoginFragment(FragmentManager fm, int viewId, Bundle bundle) {
        return null;
    }
}
