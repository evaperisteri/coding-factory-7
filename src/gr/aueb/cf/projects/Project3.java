package gr.aueb.cf.projects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Project3 {

    public static void main(String[] args) {
        File input = new File("C:/temp/reader.txt");

        char[] charCount;
        charCount = new char[128];
        int[] charAppeared = new int[128];


        for (int i = 0; i < 128; i++) {
            charCount[i]= (char) i;

            charAppeared[i] = 0;
        }

        try {
            FileReader reader = new FileReader(input);

            int character;

            while ((character = reader.read()) != -1) {
                char ch = (char) character;

                if (Character.isWhitespace(ch)) {
                    continue;
                }

                if (ch >32 && ch <= 126) {
                    boolean found = false;
                    for (int i = 0; i < 128; i++) {
                        if (charCount[i]== ch) {
                            charAppeared[i]++;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        for (int i = 0; i < 128; i++) {
                            if (charAppeared[i] == 0) {
                                charCount[i] = ch;
                                charAppeared[i] = 1;
                                break;
                            }
                        }
                    }
                }
            }
            printStatistics(charCount, charAppeared);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printStatistics(char[] charCount, int[] charAppeared) {
        System.out.println("Αταξινόμητη λίστα χαρακτήρων");
        for (int i = 0; i < 128; i++) {
            if (charAppeared[i] > 0) {
                System.out.println("Χαρακτήρας: " + charCount[i] + " Συχνότητα: " + charAppeared[i]);
            }
        }
    }
}
