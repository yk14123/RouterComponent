package com.chinafocus.minecomponent.router;

import android.content.Context;
import android.content.Intent;

import com.chinafocus.minecomponent.MainActivity;
import com.chinafocus.myrouterlib.AppConfig;
import com.chinafocus.myrouterlib.router.IMineRouter;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public class MineRouterImpl implements IMineRouter {
    @Override
    public void launch(Context context, String target) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(AppConfig.MINE_TARGET,target);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
