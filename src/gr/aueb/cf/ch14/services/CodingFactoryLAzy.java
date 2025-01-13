package gr.aueb.cf.ch14.services;

public class CodingFactoryLAzy {
    private static CodingFactoryLAzy INSTANCE = null;

    private CodingFactoryLAzy(){

    }

    public static CodingFactoryLAzy getInstance(){
        if(INSTANCE== null) {
            INSTANCE = new CodingFactoryLAzy();
        }
        return INSTANCE;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }
}
