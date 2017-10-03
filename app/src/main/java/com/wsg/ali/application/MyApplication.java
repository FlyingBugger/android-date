package com.wsg.ali.application;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * 项目名：TallyBook
 * 包名：com.wsg.ali.application
 * 文件名：MyApplication
 * 创建者：wsg
 * 创建时间：2017/7/18  18:05
 * 描述：TODO
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CrashReport.initCrashReport(getApplicationContext(), "866122ca35", true);
    }
}
