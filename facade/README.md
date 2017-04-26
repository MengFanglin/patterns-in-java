📦 外观(Facade)
----------------

现实案例
> 你是怎样开电脑的？ "按电源键" 你说！你相信那样一定可以，这是由于你正在使用电脑外部的一个简单接口，而其内部则需要完成大量工作才能实现开机。这个针对复杂子系统而设计的简单接口就是外观。

简单来说
> 外观模式为复杂子系统提供一个简化接口。

Wikipedia 上描述为
> 外观就是一个对象，它为更大规模的代码，如类库等提供简化的接口。

**编程示例**

使用上面的电脑的例子。现在先定义电脑类

```java
public class Computer {

    public void getElectricShock() {
        System.out.println("Ouch");
    }

    public void makeSound() {
        System.out.println("Beep beep!");
    }

    public void showLoadingScreen() {
        System.out.println("Loading..");
    }

    public void bam() {
        System.out.println("Ready to be used!");
    }

    public void closeEverything() {
        System.out.println("Bup bup bup buzzzz!");
    }

    public void sooth() {
        System.out.println("Zzzzz");
    }

    public void pullCurrent() {
        System.out.println("Haaah");
    }
}
```

这样定义外观

```java
public class ComputerFacade {
    private Computer computer;

    public ComputerFacade(Computer computer) {
        this.computer = computer;
    }

    public void turnOn() {
        computer.getElectricShock();
        computer.makeSound();
        computer.showLoadingScreen();
        computer.bam();
    }

    public void turnOff() {
        computer.closeEverything();
        computer.pullCurrent();
        computer.sooth();
    }
}
```

现在这样使用外观

```java
ComputerFacade facade = new ComputerFacade(new Computer());
facade.turnOn();
facade.turnOff();
```