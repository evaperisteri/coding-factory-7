package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyPattern {
    public static void main(String[] args) {
        String s = "Login;alice;pass;12345;";
        //ass much as possible -- greedy
        //Οποιοσδήποτε χαρακτήρας 0 ή περισσότερες φορές μέχρι το τελευταίο ερωτηματικό
        Pattern pattern = Pattern.compile(".*;");
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
