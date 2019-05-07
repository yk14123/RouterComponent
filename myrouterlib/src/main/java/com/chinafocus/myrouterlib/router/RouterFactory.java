package com.chinafocus.myrouterlib.router;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public class RouterFactory {
    private static RouterFactory instance = new RouterFactory();

    private RouterFactory() {
    }

    public static RouterFactory getInstance() {
        return instance;
    }

    private ILoginRouter mLoginRouter;

    public ILoginRouter getLoginRouter() {
        if (mLoginRouter ==null){
            mLoginRouter = new EmptyLoginRouter();
        }
        return mLoginRouter;
    }

    public void setLoginRouter(ILoginRouter loginRouter) {
        mLoginRouter = loginRouter;
    }

    private IMineRouter mMineRouter;

    public IMineRouter getMineRouter() {
        if (mMineRouter == null){
            mMineRouter = new EmptyMineRouter();
        }
        return mMineRouter;
    }

    public void setMineRouter(IMineRouter mineRouter) {
        mMineRouter = mineRouter;
    }
}
