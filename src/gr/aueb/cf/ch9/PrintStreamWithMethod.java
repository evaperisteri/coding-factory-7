package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {
    public static void main(String[] args) {
//        try (PrintStream ps = new PrintStream("C:/temp/file7-ps.txt", StandardCharsets.UTF_8)) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/temp/file7-ps.txt", true),
                true, StandardCharsets.UTF_8)) {
            printMessage(ps, "Hello coding factory!");
            printMessage(System.out, "Hello CF!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * generic print stream method
     * @param ps            the input print stream
     * @param message       the input message
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
