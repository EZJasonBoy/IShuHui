package com.github.chaossss.ishuhui.app.di;

import android.content.Context;
import android.view.LayoutInflater;

import com.github.chaossss.ishuhui.ui.MainActivity;
import com.github.chaossss.ishuhui.app.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chaos on 2016/1/2.
 */

@Module(
        includes = {

        },

        injects = {
                BaseApplication.class,
                MainActivity.class,

        },

        library = true
)

public class RootModule {
    private final Context context;

    public RootModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext(){
        return context;
    }

    @Provides
    public LayoutInflater provideLayoutInflater(){
        return LayoutInflater.from(context);
    }
}

