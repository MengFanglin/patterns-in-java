🌿 组合(Composite)
-----------------

现实案例
> 每个组织都由员工组成。每个员工都有相似的特征，如都有工资，都担负一些职责，需要（或者不需要）向某人汇报，有（或者没有）一些下属等。

简单来说
> 组合模式使得客户能以统一的方式对待每个对象。

Wikipedia 上描述为
> 在软件工程中，组合模式是一种分割式的设计模式。组合模式描述为：能以和对待单个对象实例相同的方式对待对象的组合。组合为的是将对象组织成树状结构，以表达 *部分-整体* 的层级关系。使用组合模式后，客户就能一致地对待单独对象和组合体了。

**编程示例**

使用上面的员工的例子。这里定义了不同类型的员工

```java
public abstract class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public abstract String getRole();
}

public class Developer extends Employee {

    public Developer(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}

public class Designer extends Employee {
    public Designer(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public String getRole() {
        return "Designer";
    }
}
```

再定义一个组织，它由不同类型的员工组成

```java
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
```

然后可以这样使用

```java
Employee dash = new Developer("dash", 123.1);
Employee rc = new Designer("rc", 123.1);

Organization organization = new Organization();
organization.addEmployees(dash);
organization.addEmployees(rc);

System.out.println("Net salary: " + organization.getNetSalary());
```