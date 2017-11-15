package dream.factory.learning.book.chapter16;

import dream.factory.learning.collections.exceptions.FraneCheckedException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox1 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        songList.sort(Comparator.reverseOrder());
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs() {
        File file = new File("SongList.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        }
        catch (IOException ex) {
            System.out.println("1");
        } finally {
            System.out.println("3");
        }
    }

    void addSong (String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }

}
