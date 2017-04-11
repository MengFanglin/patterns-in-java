package im.dashen.patterns.composite;

public class Developer extends Employee {

    public Developer(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public String getRole() {
        return "im.dashen.patterns.composite.Developer";
    }
}
