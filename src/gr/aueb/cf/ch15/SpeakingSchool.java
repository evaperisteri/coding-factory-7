package gr.aueb.cf.ch15;

/**
 * tightly coupled classes
 */
public class SpeakingSchool {
    private final Cat cat = new Cat();

    public SpeakingSchool(){

    }

    public void learnToSpeak(){
        cat.speak();
    }
}
