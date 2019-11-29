package com.oulong.config;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname DateConverter
 * @Description TODO
 * @Date 2019/11/14 16:13
 * @Created by zjl
 */
public class DateConverter implements Converter <String, Date> {

    @Override
    public Date convert(String s) {
        if ( s != null ) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return simpleDateFormat.parse(s);
            } catch ( ParseException e ) {
                e.printStackTrace( );
            }
        }
        return null;
    }
}
