package com.xuhui.story_utils.TimeUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    /**
     * yyyy-MM-dd HH:mm:ss 格式的时间
     * @return
     */
    public static String yyMMddHHmmssTime(){
        long currentTime = System.currentTimeMillis();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(currentTime);
        return format.format(date);
    }


    /**
     * 传入时间格式
     * @param formatString
     * @return
     */
    public static String currentTimeWithFormat(String formatString){
        long currentTime = System.currentTimeMillis();
        SimpleDateFormat format = new SimpleDateFormat(formatString);
        Date date = new Date(currentTime);
        return format.format(date);
    }
}
