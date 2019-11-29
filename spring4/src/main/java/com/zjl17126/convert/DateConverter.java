package com.zjl17126.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zjl
 */
public class DateConverter implements Converter<String, Date> {
    public Date convert(String s) {
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse(s);
        } catch ( ParseException e ) {
            e.printStackTrace( );
        }
        return date;
    }
}
