package com.github.chaossss.ishuhui.app.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by chaos on 2016/1/2.
 */
public class BaseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        injectViews(view);
    }

    private void injectDependencies(){
        BaseApplication baseApplication = (BaseApplication) getActivity().getApplication();
        baseApplication.inject(this);
    }

    private void injectViews(View view){
        ButterKnife.bind(this, view);
    }
}
