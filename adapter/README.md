🔌 适配器(Adapter)
-------

现实案例
> 假设你的内在卡里放有一些照片，你需要将它们传到电脑上。要完成传输，你需要一些与你的电脑接口兼容的适配器，这样你才能将内存卡与你的电脑相连。在这种情况下读卡器就是一个适配器。
> 另一个例子就是大家都知道的电源适配器; 一个三脚插头无法插到两口的插坐上，需要使用一个电源适配器才能将它与两口插坐连接。
> 还有一个例子就是翻译，他能将一个人说的话翻译给另一个听。

简单来说
> 适配器模式允许你在适配器中封装其它不兼容的对象，从而使它们与某些类兼容。

Wikipedia 上描述为
> 在软件工程中，适配器模式这种软件设计模式允许现有类的接口转成另一种接口来使用。它通常用来使现有类在无需修改其源码的情况下，与其它类实现协作。

**编程示例**

假设现有一款关于猎人猎狮的游戏。

首先定义 `Lion` 接口并实现所有种类的狮子类

```java
public interface Lion {
    String roar();
}

public class AfricanLion implements Lion {
    @Override
    public String roar() {
        return "African lion";
    }
}

public class AfricanLion implements Lion {
    @Override
    public String roar() {
        return "African lion";
    }
}

```

猎人只有当看到实现了 `Lion` 接口的猎物后才能狩猎。

```java
public class Hunter {
    public void hunt(Lion lion) {
        System.out.println("Hunter hunted " + lion.roar());
    }
}
```

现假设我们需要在游戏中加入 `WildDog`，使猎人对它们也能进行狩猎。但是我们无法直接实现，但是狗具有不同的接口。要使它与我们的猎人兼容，我们将需要创建一个兼容的适配器。

```java
public interface WildDog {
    String bark();
}

public class AfricanWildDog implements WildDog {
    @Override
    public String bark() {
        return "African wild dog";
    }
}

public class WildDogAdapter implements Lion {
    private WildDog wildDog;

    public WildDogAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    @Override
    public String roar() {
        return wildDog.bark();
    }
}
```

现在 `WildDog` 可能通过 `WildDogAdapter` 使用到我们的游戏中了。
```java
Lion asiaLion = new AsiaLion();
Lion africanLion = new AfricanLion();

WildDog wildDog = new AfricanWildDog();
WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);

Hunter hunter = new Hunter();
hunter.hunt(asiaLion);
hunter.hunt(africanLion);

// hunter can also hunt wild dog
hunter.hunt(wildDogAdapter);
```