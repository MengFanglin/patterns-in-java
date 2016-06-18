public class Emperor {
    private static Emperor emperor = new Emperor();

    public static Emperor getInstance() {
        return emperor;
    }

    private Emperor() {

    }

    public void say(){
        System.out.println("I'm the emperor dash");
    }
}
