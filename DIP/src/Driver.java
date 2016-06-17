public class Driver implements IDriver{

    @Override
    public void driver(ICar car) {
        car.run();
    }
}
