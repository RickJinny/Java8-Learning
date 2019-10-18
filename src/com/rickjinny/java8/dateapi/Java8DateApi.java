package com.rickjinny.java8.dateapi;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.zone.ZoneRules;
import java.util.Date;
import java.util.Set;

/**
 * Java8 在包java.time下包含了一组全新的时间日期api
 */
public class Java8DateApi {

    public static void main(String[] args) {
        /**
         * 第一、Clock时钟
         * Clock类提供了访问当前日期和时间的方法。
         * 可以用来取代System.currentTimeMillis()来获取当前的微妙数。
         * 某一个特定的时间点也可以使用Instant来表示, Instant类也可以用来创建老的java.util.Date对象。
         */
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        Instant instant = clock.instant();
        Date date = Date.from(instant);
        System.out.println("millis = " + millis);
        System.out.println("date = " + date);

        /**
         * 第二、Timezones时区
         */
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("availableZoneIds = " + availableZoneIds);
        ZoneId zoneId1 = ZoneId.of("Europe/Berlin");
        ZoneRules zoneRules = zoneId1.getRules();
        System.out.println("zoneRules = " + zoneRules);
    }
}
