package im.dashen.patterns.factorymethod;

public class MarktingManager extends HiringManager {
    @Override
    public Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
