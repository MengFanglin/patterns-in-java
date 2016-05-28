public class App {
    public static void main(String[] args) {
        Factory addFactory = new AddFactory();
        AbstractOperation oper = addFactory.createOperation();
        oper.setNumberA(1);
        oper.setNumberB(2);
        System.out.println(oper.getResult());

        Factory divFactory = new DivFactory();
        AbstractOperation divOper = divFactory.createOperation();
        divOper.setNumberA(1);
        divOper.setNumberB(2);
        System.out.println(divOper.getResult());
    }
}
