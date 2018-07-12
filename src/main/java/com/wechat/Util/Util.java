package com.wechat.Util;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * 类名：util
 * 开发人员: Ju
 * 创建时间: 2018/6/3 14:40
 * 描述:各类基础工具类
 * 版本：V1.0
 */
public class Util {
    /**
     *
     * @param v
     * @param l
     * @return
     */
    public static String add0(int v, int l) {
        long lv = (long) Math.pow(10, l);
        return String.valueOf(lv + v).substring(1);
    }

    /**
     * 获取当前日期 2018-01-01
     * @return
     */
    public static String getCurrentDate(){
        Calendar todaycal = Calendar.getInstance();
        String today = Util.add0(todaycal.get(Calendar.YEAR), 4) + "-" +
                Util.add0(todaycal.get(Calendar.MONTH) + 1, 2) + "-" +
                Util.add0(todaycal.get(Calendar.DAY_OF_MONTH), 2);
        return today;
    }

    /**
     * 获取当前时间 24:00:00
     * * @return
     */
    public static String getCurrentTime(){
        Calendar todaycal = Calendar.getInstance();
        String time = Util.add0(todaycal.get(Calendar.HOUR_OF_DAY), 2) + ":" +
                Util.add0(todaycal.get(Calendar.MINUTE) + 1, 2) + ":" +
                Util.add0(todaycal.get(Calendar.SECOND), 2);
        return time;
    }
}
