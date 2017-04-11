package im.dashen.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private List<Employee> employees;

    public Organization() {
        this.employees = new ArrayList<>();
    }

    public Organization(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    public Double getNetSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }
}
