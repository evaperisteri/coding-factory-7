package gr.aueb.cf.ch10;

/**
 * transform to Uppercase-lowercase
 * for instance: ATHENS to AtHeNs
 *
 */
public class UpperLowerCaseApp {
    public static void main(String[] args) {
        String message = "ATHENS";
        StringBuilder sb = new StringBuilder();
        String subStr;
        String s;

        for (int i=0; i < message.length(); i++) {
//            subStr = message.charAt(i);
            subStr = message.substring(i, i+1);
            s = (i%2 == 0)? subStr.toUpperCase() : subStr.toLowerCase();
            sb.append(s);
        }
        System.out.println(sb);
    }
}