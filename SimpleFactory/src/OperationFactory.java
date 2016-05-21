/**
 * Created by Dash on 5/21/16.
 * Package name PACKAGE_NAME
 */
public class OperationFactory {
    public static AbstractOperation createOperation(String operate){
        AbstractOperation oper = null;
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
