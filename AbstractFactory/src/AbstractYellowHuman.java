public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人人是黄皮肤的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话说中文");
    }
}
