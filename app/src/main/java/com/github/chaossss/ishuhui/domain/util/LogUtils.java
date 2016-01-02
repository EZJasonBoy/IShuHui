package com.github.chaossss.ishuhui.domain.util;

/**
 * Created by chaos on 2016/1/2.
 */
public class LogUtils {
    public LogUtils() {
    }

    public static String generateTag(Object object){
        return object.getClass().getCanonicalName();
    }
}
