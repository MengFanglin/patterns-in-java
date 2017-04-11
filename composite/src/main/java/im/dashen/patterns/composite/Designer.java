package im.dashen.patterns.composite;

public class Designer extends Employee {
    public Designer(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public String getRole() {
        return "im.dashen.patterns.composite.Designer";
    }
}
