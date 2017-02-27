🏠 简单工厂(Simple Factory)
--------------
现实案例
> 假设你正在建房，需要用到门。如果每次需要门时，你都穿上木匠服在房子里亲自制作，肯定会导致一团糟。这种情况下你需要将门放在工厂里制作。

简单来说
> 简单工厂模式对客户隐藏了所有的实例化逻辑，只简单地为客户创建实例。

Wikipedia 上描述为
> 在面向对象编程 (OOP) 中，工厂就是一个用于创建其它对象的对象,  – 形式上它可以是一个函数或方法，它在被方法调用时（假设通过 "new"）会返回不同原型或类的对象。

**编程示例**

首先定义门的接口及其实现

```java
public interface Door {
    Double getWidth();

    Double getLength();
}

public class WoodenDoor implements Door {
    private Double width;
    private Double length;

    public WoodenDoor(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public Double getWidth() {
        return this.width;
    }

    @Override
    public Double getLength() {
        return this.length;
    }
}
```

然后定义门的工厂，它创建并返回门实例

```java
public class DoorFactory {

    public static Door makeDoor(Double width, Double length) {
        return new WoodenDoor(width, length);
    }
}
```

再这样使用

```java
Door door = DoorFactory.makeDoor(100.0, 200.0);
System.out.println("Width: " + door.getWidth());
System.out.println("Length: " + door.getLength());
```

**何时用？**

当创建对象不仅只是一些赋值操作，还涉及一些逻辑操作时，就适合将这些逻辑放到一个专门的工厂中，从而能避免代码重复。