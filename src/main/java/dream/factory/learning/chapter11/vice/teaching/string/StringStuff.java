package dream.factory.learning.chapter11.vice.teaching.string;

import org.joda.time.Duration;
import org.joda.time.Instant;

public class StringStuff {
    public static void main(String[] args) {

        //brojeve od 1 do 1 000 000 sprema u string

        //String test = new String("");
        Instant startTime = Instant.now();

        String result = "";
        for (int x = 0; x < 1__000_000; x++){
            result += x + ",";
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");
        //System.out.println(test2);

    }

}
