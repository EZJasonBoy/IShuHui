package com.github.chaossss.ishuhui.domain.interactor;

import com.github.chaossss.ishuhui.executor.Interactor;
import com.github.chaossss.ishuhui.executor.InteractorExecutor;
import com.github.chaossss.ishuhui.executor.MainThreadExecutor;

/**
 * Created by chaos on 2016/1/2.
 */
public abstract class AbstractInteractor implements Interactor {
    private InteractorExecutor interactorExecutor;
    private MainThreadExecutor mainThreadExecutor;

    public AbstractInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor) {
        this.interactorExecutor = interactorExecutor;
        this.mainThreadExecutor = mainThreadExecutor;
    }

    public InteractorExecutor getInteractorExecutor() {
        return interactorExecutor;
    }

    public void setInteractorExecutor(InteractorExecutor interactorExecutor) {
        this.interactorExecutor = interactorExecutor;
    }

    public MainThreadExecutor getMainThreadExecutor() {
        return mainThreadExecutor;
    }

    public void setMainThreadExecutor(MainThreadExecutor mainThreadExecutor) {
        this.mainThreadExecutor = mainThreadExecutor;
    }
}
