/**
 * Created by Dash on 5/21/16.
 * Package name PACKAGE_NAME
 */
public class OperationAdd extends AbstractOperation{
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}
