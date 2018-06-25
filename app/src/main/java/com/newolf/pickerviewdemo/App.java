package com.newolf.pickerviewdemo;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * ================================================
 *
 * @author : NeWolf
 * @version : 1.0
 *          date :  2018/6/25
 *          desc:
 *          histry:
 *          ================================================
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "35d6365148", BuildConfig.DEBUG);
    }
}
