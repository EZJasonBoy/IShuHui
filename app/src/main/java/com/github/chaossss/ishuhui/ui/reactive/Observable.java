package com.github.chaossss.ishuhui.ui.reactive;

/**
 * Created by chaos on 2016/1/2.
 */
public interface Observable<T> {
    void register(T observer);
    void unregister(T observer);
}
