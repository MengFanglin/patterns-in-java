👷 创造者(Builder)
--------------------------------------------

现实案例
> 假设你在 Harees(美国连锁快餐店)，你下了单，假定说要来份 "大份装"，然后店员 *无需再多问* 就直接为你送上 "大份装"; 像这样的就是简单工厂模式的例子。但是有些情况下创建逻辑可能要涉及多个步骤。例如你想要一份定制餐，你给出了如何做汉堡的具体要求，例如使用什么面包，使用何种酱汁，何种奶酪等。那么这种情况下就需要使用建造者模式。

简单来说
> 它允许你创建 ”不同口味" 的对象，同时又能避免 “污染” 构造函数的参数。适合当某对象可能会有多种 “口味"，或者对象的创建过程涉及多个步骤时使用。
 
Wikipedia 上描述为
> 建造者模式是一种对象创建的软件设计模式，它意在为重叠构造器这种反模式(telescoping constructor anti-pattern)找到一种解决方案。

既然说到了，那让我多说几句什么是重叠构造器反模式(telescoping constructor anti-pattern)。我们或多或少有看到过像这样的构造函数：
 
```java
public Burger (int size, String cheese, String pepperoni, String tomato, String lettuce) {

}
```

可以看到; 构造函数的参数个数很快会变得一发不可收拾，从而要理解参数布局会变得困难。另外假如以后还要添加更多功能的话，该参数列表还会继续增长。这就是所谓的重叠构造器反模式(telescoping constructor anti-pattern)。

**编程示例**

理智地选择是使用建造者模式。首先定义我们需要制作的汉堡类

```java
public class Burger {
    private int size;
    private String cheese;
    private String pepperoni;
    private String lettuce;
    private String tomato;


    public Burger(BurgerBuilder builder) {
        size = builder.getSize();
        cheese = builder.getCheese();
        pepperoni = builder.getPepperoni();
        lettuce = builder.getLettuce();
        tomato = builder.getTomato();
    }
}
```

然后定义建造者类

```java
public class BurgerBuilder {
    private int size;
    private String cheese;
    private String pepperoni;
    private String lettuce;
    private String tomato;

    public BurgerBuilder(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getCheese() {
        return cheese;
    }

    public BurgerBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public String getPepperoni() {
        return pepperoni;
    }

    public BurgerBuilder setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public String getLettuce() {
        return lettuce;
    }

    public BurgerBuilder setLettuce(String lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public String getTomato() {
        return tomato;
    }

    public BurgerBuilder setTomato(String tomato) {
        this.tomato = tomato;
        return this;
    }

    public Burger build() {
        return new Burger(this);
    }
}
```

然后可以这样使用:

```php
 Burger burger = new BurgerBuilder(12)
                .setTomato("tomato")
                .setPepperoni("pepperoni")
                .setLettuce("lettuce")
                .setCheese("cheese")
                .build();
```

**何时使用？**

当某个对象可能会有多种 "口味"，或者想避免重叠构造器反模式(telescoping constructor anti-pattern) 时使用。它与工厂模式的主要区别在于：工厂模式适用于创建过程只有一个步骤的情况，而建造者模式适用于创建过程涉及多个步骤的情况。
