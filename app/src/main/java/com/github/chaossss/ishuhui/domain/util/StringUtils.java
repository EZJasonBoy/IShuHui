package com.github.chaossss.ishuhui.domain.util;

/**
 * Created by chaos on 2016/1/2.
 */
public class StringUtils {
    public StringUtils() {
    }

    public static boolean isValid(String str){
        return str != null && !str.equals("");
    }
}
