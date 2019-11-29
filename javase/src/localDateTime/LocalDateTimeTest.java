package localDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * @Classname LocalDateTimeTest
 * @Description TODO
 * @Date 2019/11/15 14:04
 * @Created by zjl
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
//        LocalDateTimeTest dateTimeTest = new LocalDateTimeTest( );
//        dateTimeTest.local();
//        dateTimeTest.localInput();
//        dateTimeTest.plusLocal();
        String datetime =  "2018-01-13 21:27:30";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(datetime, dtf);
        System.out.println(ldt);


    }
    public void local(){
        LocalDate localDate = LocalDate.now( );
        LocalTime localTime = LocalTime.now( );
        LocalDateTime localDateTime = LocalDateTime.now( );
        System.out.println(localDate );
        System.out.println(localTime );
        System.out.println(localDateTime );
    }
    public void localInput(){
        LocalDate localDate = LocalDate.of(2019, 11, 14);
        LocalTime localTime = LocalTime.of(14, 9, 34);
        LocalDateTime localDateTime = LocalDateTime.of(2019, 11, 23, 14, 3, 45);
        System.out.println("localDate"+localDate );
        System.out.println("localTime"+localTime);
        System.out.println("localDateTime"+localDateTime);
    }
    public void plusLocal(){
        LocalDate localDate = LocalDate.now( );
        LocalDate date = localDate.plusDays(1);
        System.out.println(date );
    }
}
