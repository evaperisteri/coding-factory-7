package gr.aueb.cf.ch20.enums;

public enum AccountType {

    //τεχνικά αντιστοιχούν σε αριθμούς
    DEPOSIT("DE"),    //ordinal 0
    SAVINGS("SA"),    //ordinal 1
    CURRENT("CU") ;     //ordinal 2
    private final String code;
    //constructor
    private AccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
