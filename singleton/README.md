💍 单例(Singleton)
------------

现实案例
> 一个国家在同一时期只能有一位总统。当需要担起责任时，都是这位总统实施行动的。这里总统就是单例。

简单来说
> 它能确保某个类永远只能够创建一个对象。

Wikipedia 上描述为
> 在软件工程中，单例模式是一种软件设计模式，它限制某个类只能实例化成一个对象。当系统中需要确切一个对象来协调行为时，单例是很适合的。

单例模式实际上被认为是一种反模式，因此需避免过度使用。它不一定就是不好的，它有它的适用情况，但是使用时应当当心，因为它在你的程序中引用了一个全局状态，因此在某处对它的修改可能会影响其它地方，从而对它进行调试会变得相当困难。

**编程示例**

创建一个单例，将构造器设为私有，并创建一个静态变量来保存实例

```java
public class President {
    private static President president;

    public static President getPresident() {
        if (president == null) {
            synchronized (President.class) {
                if (president == null) {
                    president = new President();
                }
            }
        }
        return president;
    }

    private President() {
    }
}
```

然后这样使用

```java
ExecutorService service = Executors.newFixedThreadPool(5);
Runnable task = () -> {
    President president = President.getPresident();
    System.out.println(president.hashCode());
};
for (int i = 0; i < 5; ++i) {
    service.execute(task);
}
service.shutdown();
}
```