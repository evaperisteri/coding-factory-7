package gr.aueb.cf.ch13.exceptions;

public class NegativeAmountExcception extends Exception{

    public NegativeAmountExcception(double amount){
        super("Amount " + amount + "is negative.");
    }
}
