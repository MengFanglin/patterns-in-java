☕ 装饰器(Decorator)
-------------

现实案例

> 假设你运营一家能提供多种服务的汽车服务店。现在你怎样计算要收的费用？你会根据提供了的所有服务，将每项服务费用都动态叠加进去，直到算出总额。这里每种服务都是一种装饰器。

简单来说
> 装饰器模式通过将对象封装在装饰器类的对象中，从而使你能在运行时动态地修改原对象的行为。

Wikipedia 上描述为
> 在面向对象编程中，装饰器这种设计模式允许以静态或者动态的方式，将行为添加到某个对象中，而这种修改不会影响相同类中的其它实例对象的行为。装饰器模式通常对于遵循单一职责原则(Single Responsibility Principle)很有用, 因为它允许功能在类间进行划分，使得各个类只专注各自的功能领域。

**编程示例**

以咖啡为例。首先为简单咖啡实现咖啡接口

```java
public interface Coffee {
    Double getCost();
    String getDescription();
}

public class SimpleCoffee implements Coffee {

    @Override
    public Double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
```

我们想使代码可扩展，允许在需要的时候能够修改选项。让我们增加一些添加物（装饰器）

```java
public class MilkCoffee implements Coffee {
    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 2.2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",milk";
    }
}

public class WhipCoffee implements Coffee {
    private Coffee coffee;

    public WhipCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",whip";
    }
}

public class VanillaCoffe implements Coffee {
    private Coffee coffee;

    public VanillaCoffe(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+3.1;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+",vanilla";
    }
}

```

现在可以制作咖啡了

```java
Coffee someCoffee = new SimpleCoffee();
System.out.println(someCoffee.getCost());
System.out.println(someCoffee.getDescription());


Coffee milkCoffee = new MilkCoffee(someCoffee);
System.out.println(milkCoffee.getCost());
System.out.println(milkCoffee.getDescription());

Coffee whipCoffee = new WhipCoffee(milkCoffee);
System.out.println(whipCoffee.getCost());
System.out.println(whipCoffee.getDescription());

Coffee vanillaCoffee = new VanillaCoffe(whipCoffee);
System.out.println(vanillaCoffee.getCost());
System.out.println(vanillaCoffee.getDescription());
```
