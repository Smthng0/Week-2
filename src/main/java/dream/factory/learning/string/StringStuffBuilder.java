package dream.factory.learning.string;

import org.joda.time.Duration;
import org.joda.time.Instant;

public class StringStuffBuilder {
    public static void main(String[] args) {

        //brojeve od 1 do 1 000 000 sprema u string

        //String test = new String("");
        Instant startTime = Instant.now();

        StringBuilder result = new StringBuilder(); //opasno!!!
        for (int x = 0; x < 140_000_000; x++){
            result.append(x).append(",");
        }
        String output = result.toString();

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms" + " size of" + ((long)output.length() * 4));
        //System.out.println(test2);

    }

}
