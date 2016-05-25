public class Proxy implements AbstractSubject {
    private Subject subject;


    @Override
    public void request() {
        if (subject == null) {
            subject = new Subject();
        }
        subject.request();
    }
}
