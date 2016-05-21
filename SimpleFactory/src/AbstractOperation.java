/**
 * Created by Dash on 5/21/16.
 * Package name ${PACKAGE_NAME}
 */
public abstract class AbstractOperation {
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult(){
        double result = 0;
        return result;
    }
}
