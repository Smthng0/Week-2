package dream.factory.learning.encoding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestBOM {
    public static void main(String[] args) {
        File file = new File("test-enkoding.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }


    }
}
