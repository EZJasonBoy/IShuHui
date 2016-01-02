package com.github.chaossss.ishuhui.ui.presenter;

import android.view.View;

/**
 * Created by chaos on 2016/1/2.
 */
public interface Presenter<T extends View> {
    void initialize();

    void onViewCreate();

    void onViewResume();

    void onViewDestroy();

    void setView(T view);
}
