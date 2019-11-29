package com.oulong.config;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter <Date> {

    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        LocalDateTime localDateTime = LocalDateTime.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return new Date(localDateTime.getSecond( ));
    }

    @Override
    public String print(Date object, Locale locale) {
        Instant instant = object.toInstant( );
        LocalDateTime now = LocalDateTime.ofInstant(instant, ZoneId.systemDefault( ));
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
