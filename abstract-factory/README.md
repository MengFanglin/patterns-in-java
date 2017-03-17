🔨 抽象工厂(Abstract Factory)
----------------

现实案例
> 继续简单工厂模式中门的例子。基于你的需求，你可能要从木门店获取木门，从铁门店获取铁门，或者从 PVC 相关店获取 PVC 门。另外你可能还要找不同专长的人来安装门，例如找木匠来安装木门，找电焊工来安装铁门等等。可以看到现在门已经有了依赖性，比如木门依赖于木匠，铁门依赖于电焊工等。

简单来说
> 就是工厂的工厂; 该工厂将各个相关/相依赖的工厂组合起来，而无需指定他们具体的类。

Wikipedia 上描述为
> 抽象工厂模式提供了一种将具有相同风格的一组工厂封闭起来的方法，而无需指定各工厂具体的类。

**编程示例**

修改上面门的例子。首先定义 `Door` 接口并做出几个实现

```java
public interface Door {
    String getDescription();
}

public class WoodenDoor implements Door {
    @Override
    public String getDescription() {
        return "Wooden door";
    }
}

public class IronDoor implements Door {
    @Override
    public String getDescription() {
        return "Iron door";
    }
}
```

然后为每种门都定义相应的安装人员

```java
public interface DoorFittingExpert {
    String getDescription();
}

public class Welder implements DoorFittingExpert {
    @Override
    public String getDescription() {
        return "I can only fit iron door";
    }
}

public class Carpenter implements DoorFittingExpert {
    @Override
    public String getDescription() {
        return "I can only fit wooden door";
    }
}
```

现在定义我们的抽象工厂，它能为我们创建相关的一组对象，例如木门工厂将会创建木门及木门安装人员对象，而铁门工厂将会创建铁门及铁门安装人员对象。

```java
public interface DoorFactory {
    Door makeDoor();

    DoorFittingExpert makeFittingExpert();
}

// 木门工厂将返回木匠及木门对象
public class WoodenDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}

// 铁门工厂将返回铁门及相应的安装人员
public class IronDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
```

然后可以这样使用

```java
DoorFactory woodenDoorFactory = new WoodenDoorFactory();
Door woodenDoor = woodenDoorFactory.makeDoor();
DoorFittingExpert carpenter = woodenDoorFactory.makeFittingExpert();
System.out.println(carpenter.getDescription());
System.out.println(woodenDoor.getDescription());


DoorFactory ironDoorFactory = new IronDoorFactory();
Door ironDoor = ironDoorFactory.makeDoor();
DoorFittingExpert welder = ironDoorFactory.makeFittingExpert();
System.out.println(welder.getDescription());
System.out.println(ironDoor.getDescription());
```

可以看到木门工厂已经封装了 `木匠` 和 `木门` 而铁门工厂已经封闭了 `铁门` 和 `电焊工`。这样它就能确保，每次创建了一个门对象后，我们也可以得到其相应的安装人员对象。

**何时使用？**

当创建逻辑有点复杂但内部又相互关联时使用。