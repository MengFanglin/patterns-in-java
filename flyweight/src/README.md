🍃 享元(Flyweight)
---------

现实案例
> 你有过在摊位上品尝过新茶吗？他们通常沏出比你所要的还要多的杯数，然后将多余的荼留给其他客人，从而起到节约资源（如燃气）的目的。享元模式的全部即共享。

简单来说
> 它能使相似对象间通过尽可能多地共享，以减少内存使用和计算花销。

Wikipedia 上描述为
> 在计算机编程中，享元是一种软件设计模式。一个享元就是一个对象，它通过与其它相似对象共享尽可能多的数据，以达到对内存的最少化使用;它适用于对象数量庞大的情况，此时简单地重复表示将需要过量的内存量。

**编程示例**

实现以上的茶的例子。首先定义各种茶和茶艺师

```java
// Anything that will be cached is flyweight. 
// Types of tea here will be flyweights.
public class Tea {
}

// Acts as a factory and saves the tea
public class TeaMaker {

    private Map<String, Tea> availableTeas = new HashMap<>();

    public Tea make(String teaType) {
        availableTeas.computeIfAbsent(teaType, k -> new Tea());
        return availableTeas.get(teaType);
    }
}
```

然后定义 `TeaShop`，提供饮茶服务

```java
public class TeaShop {

    private List<Tea> orders = new ArrayList<>();
    private TeaMaker maker;

    public TeaShop(TeaMaker maker) {
        this.maker = maker;
    }

    public void takeOrder(String teaType) {
        orders.add(maker.make(teaType));
    }

    public void serve() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Serving tea to table#"+i);
        }
    }
}
```

可以如下使用

```java
TeaMaker maker = new TeaMaker();
TeaShop shop = new TeaShop(maker);
shop.takeOrder("less sugar");
shop.takeOrder("more milk");
shop.takeOrder("without sugar");
shop.serve();
```