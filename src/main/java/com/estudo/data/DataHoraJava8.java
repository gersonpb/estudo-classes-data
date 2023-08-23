package com.estudo.data;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * JAVA 8 - API de Data e Hora
 */
public class DataHoraJava8 {
    public static void main(String[] args) {
        // LocalDate - representa uma data: 23/07/1975
        LocalDate ldNow = LocalDate.now();
        System.out.println("ldNow "+ldNow);
        final LocalDate ldOf = LocalDate.of(2013, Month.JULY, 14);
        System.out.println("ldOf "+ldOf);

        final LocalDate ldPlus = ldNow.plusWeeks(2).plusDays(1).minusMonths(1);
        System.out.println("ldPlus " + ldPlus);

        // LocalTime - representa uma hora: 11:40:00
        LocalTime ltNow = LocalTime.now();
        System.out.println("ltNow "+ltNow);
        final LocalTime ltOf = LocalTime.of(10, 12, 44, 100000);
        System.out.println("ltOf "+ltOf);


        // LocalDateTime - representa data+hora: 19/08/2023 11:40:00 em qq lugar do mundo
        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println("ldtNow " + ldtNow);
        LocalDateTime ldtOf = LocalDateTime.of(ldNow, ltNow);
        System.out.println("ldtOf " + ldtOf);
        // Instant - representa uma instante/momento na linha
            // do tempo (milissegundos a partir de 01/01/1970 00:00:00) no timeZone
            // 19/08/2023 11:40:00 GMT (Greenwich Mean Time)/UTC (Universal Time Coordinated)
        Instant iNow = Instant.now();
        System.out.println("iNow " + iNow);
        Instant instant = Instant.ofEpochMilli(500000000000L);
        System.out.println("instant " + instant);
        Instant instant1 = instant.plus(1, ChronoUnit.DAYS);
        System.out.println("instant1 " + instant1);



        // ZonedDateTimer - LocalDateTime com TimeZone (fuso horário) 19/08/2023 11:40:00 GMT-3 (America_Sao_Paulo)
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println("zdtNow " + zdtNow);
        final ZoneId zoneId = ZoneId.of("America/Montevideo");
        final ZonedDateTime zdtOf = ZonedDateTime.of(ldtNow, zoneId);
        System.out.println("zdtOf " + zdtOf);


    }
}
