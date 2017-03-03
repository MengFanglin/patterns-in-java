package im.dashen.patterns.factorymethod;

public class DevelopmentHiringManager extends HiringManager {
    @Override
    public Interviewer makeInterviewer() {
        return new Developer();
    }
}
