package com.android.library.base;

import android.app.Application;

public abstract class BaseApp extends Application {

    private static BaseApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
