🚡 桥接(Bridge)
------

现实案例
> 假设你有一个由多个不同的页面组成的网站，然后你想让用户可以修改页面主题风格。那么你会怎么做？是为每一个页面针对每一个主题风格都创建一个复本，还是只创建分离的主题风格，然后根据用户的喜好加载主题风格？如果你想用第二种办法，那么桥接模式就是你的解决之道。

![With and without the bridge pattern](https://cloud.githubusercontent.com/assets/11269635/23065293/33b7aea0-f515-11e6-983f-98823c9845ee.png)

简单来说
> 桥接模式认为组合优于继承。它能将一个层级结构中的实现细节转到位于另一个分离的层级结构的对象中。

Wikipedia 上描述为
> 桥接模式是软件设计模式之一，它意在 ”将抽象与真实现分离，从而使它们可以各自独立的变化“。

**编程示例**

实现上面的网站的例子，这里定义了 `WebPage` 的层级结构

```java
public interface WebPage {

    String getContent();
}


public class About implements WebPage {

    private Theme theme;

    public About(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "About page with " + theme.getColor() + " color";
    }
}


public class Careers implements WebPage {
    private Theme theme;

    public Careers(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Careers page with " + theme.getColor() + " color";
    }
}
```

然后是另外分离的主题风格层级结构

```java
public interface Theme {

    String getColor();
}


public class DarkTheme implements Theme {

    @Override
    public String getColor() {
        return "Dark black";
    }
}

public class LightTheme implements Theme {

    @Override
    public String getColor() {
        return "Off white";
    }
}

public class AquaTheme implements Theme {

    @Override
    public String getColor() {
        return "Light blue";
    }
}

```

最后将两个层级结构组合起来

```java
Theme darkTheme = new DarkTheme();
Theme aquaTheme = new AquaTheme();

WebPage about = new About(darkTheme);
WebPage careers = new Careers(aquaTheme);

System.out.println(about.getContent());
System.out.println(careers.getContent());
```