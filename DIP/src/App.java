public class App {
    public static void main(String[] args) {
        IDriver dash = new Driver();
        ICar bmw = new BMW();
        dash.driver(bmw);
    }
}
