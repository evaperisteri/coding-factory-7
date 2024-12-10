package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * copy line by line to a new file
 */
public class BufferedReaderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader bf = new BufferedReader(new FileReader("C:/temp/bf-read.txt"))){
            String Line = "";

            while((Line = bf.readLine()) != null){
                sb.append(Line).append("\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
