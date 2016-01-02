package com.github.chaossss.ishuhui.app.base;

import android.app.Application;
import android.content.Context;

import com.github.chaossss.ishuhui.app.di.RootModule;

import dagger.ObjectGraph;

/**
 * Created by chaos on 2016/1/2.
 */
public class BaseApplication extends Application{
    private ObjectGraph objectGraph;

    /**
     * Static method uses to getting application context
     *
     * @param context
     * @return
     */
    public static BaseApplication get(Context context){
        return (BaseApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(new RootModule(this));
        objectGraph.inject(this);
    }

    public void inject(Object object){
        objectGraph.inject(object);
    }

    /**
     * Add a new module to the dependency graph
     *
     * @param modules
     */
    public void addModules(Object... modules){
        objectGraph.plus(modules);
    }
}
