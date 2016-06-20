public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白人是白皮肤的");
    }

    @Override
    public void talk() {
        System.out.println("白人说话说英语");
    }
}
