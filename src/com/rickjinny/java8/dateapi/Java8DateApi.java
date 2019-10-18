package com.rickjinny.java8.dateapi;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.zone.ZoneRules;
import java.util.Date;
import java.util.Locale;
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

        /**
         * 第三、LocalTime 本地时间
         * LocalTime 定义了一个没有时区信息的时间
         */
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        // LocalTime提供了多种工厂方法来简化对象的创建，包括解析时间字符串
        LocalTime localTime = LocalTime.of(21, 20, 30);
        System.out.println("localTime = " + localTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofLocalizedTime(FormatStyle.SHORT)
                .withLocale(Locale.GERMAN);
        LocalTime time = LocalTime.parse("19:28", dateTimeFormatter);
        System.out.println("time = " + time);
    }
}
