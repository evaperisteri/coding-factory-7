package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {
    public static void main(String[] args) {
        File infd = new File("C:/temp/file7.txt");
        File outfd = new File("C:/temp/file7-out.txt");
        String Line;
        String[] tokens;

        try(Scanner in = new Scanner(infd);
            PrintStream ps = new PrintStream(outfd, StandardCharsets.UTF_8)) {
            while(in.hasNextLine()){
                Line = in.nextLine();
                tokens = Line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                    ps.printf("%s ", token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
