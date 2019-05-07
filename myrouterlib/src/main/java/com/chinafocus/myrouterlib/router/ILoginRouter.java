package com.chinafocus.myrouterlib.router;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public interface ILoginRouter {
    void launch(Context context,String target);
    Fragment addLoginFragment(FragmentManager fm, int viewId, Bundle bundle);
}
