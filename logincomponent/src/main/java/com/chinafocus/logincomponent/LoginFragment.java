package com.chinafocus.logincomponent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * @author
 * @date 2019/5/7
 * description：
 */
public class LoginFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.login_component_fragment_one, container, false);

        Bundle arguments = getArguments();
        String fragment = arguments.getString("fragment");
        if (fragment!=null){
            Toast.makeText(getContext(), "from fragment one == " + fragment, Toast.LENGTH_SHORT).show();
        }

        return inflate;
    }
}
