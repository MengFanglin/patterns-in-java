public class Subject implements AbstractSubject {

    @Override
    public void request() {
        System.out.println("真实请求");
    }
}
