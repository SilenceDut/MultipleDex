package com.silencedut.multipledex;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by SilenceDut on 16/8/17.
 */

public class App extends Application{

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
