package com.dompine.orz2021.util;

import org.springframework.stereotype.Component;

/**
 * @Author dompine
 * @Date 2021/1/16 5:03
 */
@Component
public class DayUtil {

    //获取今日0点时间戳
    static public Long getTodayZeroPointTimeStamps() {
        Long currentTimestamps = System.currentTimeMillis();
        Long oneDayTimestamps = Long.valueOf(60 * 60 * 24 * 1000);
        return currentTimestamps - (currentTimestamps + 60 * 60 * 8 * 1000) % oneDayTimestamps;
    }

    //获取昨日0点时间戳
    static public Long getYesterdayZeroPointTimeStamps() {
        Long currentTimestamps = System.currentTimeMillis();
        Long oneDayTimestamps = Long.valueOf(60 * 60 * 24 * 1000);
        return currentTimestamps - (currentTimestamps + 60 * 60 * 8 * 1000) % oneDayTimestamps - oneDayTimestamps;
    }

    //获取明日0点时间戳
    static public Long getTomorrowZeroPointTimeStamps() {
        Long currentTimestamps = System.currentTimeMillis();
        Long oneDayTimestamps = Long.valueOf(60 * 60 * 24 * 1000);
        return currentTimestamps - (currentTimestamps + 60 * 60 * 8 * 1000) % oneDayTimestamps + oneDayTimestamps;
    }
}
