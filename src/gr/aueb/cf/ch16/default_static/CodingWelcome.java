package gr.aueb.cf.ch16.default_static;

public class CodingWelcome implements IWelcome{

    //hide στην στατικ μεθοδο του IWELCOME η οποία δεν μπορει να ερθει με override
    public static void staticMethod(){
        System.out.println("static method from CodingWelcome hides IWelcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("overriden default method in CodingWelcome");
        IWelcome.super.defaultMethod();
    }
}
