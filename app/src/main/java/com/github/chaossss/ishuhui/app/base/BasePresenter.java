package com.github.chaossss.ishuhui.app.base;

import android.content.Context;

/**
 * Created by chaos on 2016/1/2.
 */
public class BasePresenter {
    public BasePresenter(Context context) {
        ((BaseApplication) context.getApplicationContext()).inject(this);
    }
}
