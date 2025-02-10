package gr.aueb.cf.ch20;

public class RegExMain {
    public static void main(String[] args) {
        String s = "red";
        System.out.println(isRed(s));
        String s1 = "green";
        System.out.println(isRedOrGreen(s1));
        String s2 = "Uing";
        System.out.println(beginsWithOneUpperCaseAndEndsWithIng(s2));
        String s3 = " 9";
        System.out.println(whitespaceDigit(s3));

        String s4 = "info@aueb.gr";
        System.out.println(isEmail(s4));

        String s5 ="Athens  School    of Economics and   Business";
        String[] tokens = doSplit(s5);
        for (String token: tokens) {
            System.out.print(token + " ");
        }
        System.out.println();
        String s6 ="Athens  School   of Economics and   Business";
        System.out.print(doReplace(s6));
        System.out.println();
        String s7 = "Eva Peristeri";
        System.out.println(doReplaceBackReference(s7));
    }


    /**
     * Ελέγχει (matches) αν το input String είναι "red"
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        //case sensitive
        return s.matches("red");         //ελέγχει αν ενα String κάνει match. όχι πολλαπλές εμφανίσεις αυτού
    }

    /**
     * Ελέγχει (matches) αν το input String είναι "red" ή "green"
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");         //ελεγχει αν ενα στρινγ κανει ματς. όχι πολλαπλές εμφανίσεις αυτού
    }

    /**
     * Ελέγχει (matches) αν το input String είναι "red" ή "Red"
     * ή "green" ή "Green"
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");         //ελεγχει αν ενα στρινγ κανει ματς. όχι πολλαπλές εμφανίσεις αυτού
    }

    public static boolean beginsWithOneUpperCaseAndEndsWithIng (String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean oneLetterWithIngEnding (String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whitespaceDigit (String s) {
        return s.matches("\\s\\d");
        //return s.matches("^\\s\\d$");  Το ^ και το $ υπονοούνται μεσα στην .matches()
    }

    public static boolean anySymbolDigit (String s) {
//        return s.matches(".\\d");
//        return s.matches(".[0-9]"); ΟΜΟΙΩΣ
        return s.matches("[\\w\\W]\\d"); //περιλαμβανει και την αλλαγή γραμμης
    }
    //ab.andr@aueb.com
    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");       //ελέγχει το format της ημερομηνίας
//        return s.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");      //ελέγχει και την εγκυροτητα
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");     //διαχωρίζει με βάση το space. (+) σημαίνει ένα ή περισσότερα κενά
    }

    public static String doReplace(String s){
        return s.replaceAll("\\s+","&");
    }

    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2, $1");
    }
}
