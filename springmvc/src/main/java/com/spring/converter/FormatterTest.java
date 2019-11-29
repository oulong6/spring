package com.spring.converter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * @author zjl
 */
public class FormatterTest implements Formatter<Date> {
    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        LocalDateTime parse = LocalDateTime.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return Date.from(parse.atZone(ZoneId.systemDefault()).toInstant());
    }
    @Override
    public String print(Date object, Locale locale) {
        LocalDateTime localDateTime = object.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return localDateTime.toString();
    }
}
