
/**
 * Created by Dash on 5/21/16.
 * Package name PACKAGE_NAME
 */
public class App {
    public static void main(String [] args){
        AbstractOperation oper;
        oper = OperationFactory.createOperation("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = oper.getResult();
        System.out.println(result);
    }
}
