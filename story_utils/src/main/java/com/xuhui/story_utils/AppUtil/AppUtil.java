package com.xuhui.story_utils.AppUtil;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class AppUtil {

    /**
     * 获取版本号
     * @return
     */
    public static String getVersion(Context context){
        PackageManager manager = context.getPackageManager();
        String version = null;
        try {
            PackageInfo info = manager.getPackageInfo(context.getPackageName(),0);
            version = info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }
}
