package dream.factory.learning.chapter11.vice.teaching.time;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;



public class TimeStuff {
    public static void main(String[] args) {
        DateTime sada = null;
        DateTimeFormatter fo = DateTimeFormat.forPattern("YYYY.MM.dd HH:mm");
        int seconds = (int) (29.52 * 24 * 60 * 60);
        sada = new DateTime(1507371145000l);


        for(int i = 0; i < 60; i++){
            sada = sada.plusSeconds(seconds);
            System.out.println(fo.print(sada));

        }
    }
}

