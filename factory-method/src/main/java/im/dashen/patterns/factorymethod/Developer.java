package im.dashen.patterns.factorymethod;

public class Developer implements Interviewer {
    @Override
    public void askQuestion() {
        System.out.println("Asking about java");
    }
}
