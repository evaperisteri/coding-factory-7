package gr.aueb.cf.ch14.services;

/**
 * epistrefei mono ena instance
 */
public class CodingFactorySingleton {
    //Eager policy με το που δημιουργειται η κλαση δημιουργείται και το instance
    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    private CodingFactorySingleton(){

    }

    public static CodingFactorySingleton getInstance(){
        return INSTANCE;
    }
    public void sayHello(){
        System.out.println("Hello");
    }
}
