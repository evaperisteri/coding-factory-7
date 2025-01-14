package gr.aueb.cf.ch15;

/**
 * loosely coupled classes
 */
public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;

    /**
     * dependency injection από τον constructor
     * IoC - Inversion of Control
     * @param iSpeakable
     */
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void learnToSpeak(){
        iSpeakable.speak();
    }
}
