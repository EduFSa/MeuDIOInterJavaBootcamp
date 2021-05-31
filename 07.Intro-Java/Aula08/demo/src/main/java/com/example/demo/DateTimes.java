package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimes {
    public static void main(String[] args) {
        Date agora = new Date();
        String agoraText = DateFormat.getInstance().format(agora);
        System.out.println(agoraText);

        agoraText = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(agoraText);

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        agoraText = format.format(agora);
        System.out.println(agoraText);

        LocalDate hoje = LocalDate.now();
        var ontem = hoje.minusDays(4);
        System.out.println(ontem.format(DateTimeFormatter.ofPattern("yy/MM/dd E")));
        if (ontem.getDayOfWeek() == DayOfWeek.SUNDAY || ontem.getDayOfWeek() == DayOfWeek.SATURDAY) {
            System.out.println("It is weekend");
        }

        LocalDateTime horaDia = LocalDateTime.of(2010, 05, 10, 10, 00, 00);
        var diaFuturo = horaDia.plusYears(4);
        diaFuturo = diaFuturo.plusMonths(6);
        diaFuturo = diaFuturo.plusHours(13);
        System.out.println(diaFuturo.format(DateTimeFormatter.ISO_DATE_TIME));

    }
}
