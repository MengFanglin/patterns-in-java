package im.dashen.patterns.factorymethod;

public abstract class HiringManager {
    public abstract Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestion();
    }
}
