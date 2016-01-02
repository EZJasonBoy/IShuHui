package com.github.chaossss.ishuhui.app.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by chaos on 2016/1/2.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    private void injectDependencies() {
        BaseApplication baseApplication = (BaseApplication) getApplication();
        baseApplication.inject(this);
    }

    private void injectViews() {
        ButterKnife.bind(this);
    }
}
