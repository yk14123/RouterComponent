package com.chinafocus.logincomponent.router;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chinafocus.myrouterlib.ILoginExportService;

/**
 * @author
 * @date 2019/5/7
 * description：
 */

@Route(path = "/login/loginService", name = "测试服务")
public class LoginService implements ILoginExportService {
    @Override
    public String sayHello(String s) {
        return "LoginService sayHello -- >" + s;
    }

    @Override
    public void init(Context context) {

    }
}
