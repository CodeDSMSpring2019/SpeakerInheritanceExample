package edu.dmacc.codedsm.inherit;

public class QASpeaker extends Person implements Speaker, Tester {

    public QASpeaker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void speak(String message) {
        System.out.println("I'm a QA " + message);
    }

    @Override
    public Boolean performTest(String testSuite) {
        return false;
    }
}
