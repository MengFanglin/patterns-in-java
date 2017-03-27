🐑 原型(Prototype)
------------

现实案例
> 还记得多莉吗？那只克隆羊！我们先不要关注细节，但是这里的重点是克隆。

简单来说
> 根据某个现存的对象，通过克隆来创建对象。

Wikipedia 上描述为
> 原型模式是软件开发中的创建型设计模式。它用于当所需创建的对象的类型是由某个原型实例决定的情况，并通过克隆该原型实例来产生新的对象。

简单来说，它能让你创建某个现有对象的克隆版本，然后你可按需对其进行修改，从而避免了从新创建一个对象并对其进行设置的所有麻烦。

**编程示例**
 
```java
public class im.dashen.patterns.prototype.Sheep implements Cloneable {

    private String name;
    private String category;

    public im.dashen.patterns.prototype.Sheep(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }
}
```

然后像下面这样进行克隆

```java
im.dashen.patterns.prototype.Sheep jolly = new im.dashen.patterns.prototype.Sheep("jolly", "origin");
System.out.println("Name: " + jolly.getName());
System.out.println("Category: " + jolly.getCategory());

im.dashen.patterns.prototype.Sheep dolly = (im.dashen.patterns.prototype.Sheep) jolly.clone();
dolly.setName("dolly");
System.out.println("Name: " + dolly.getName());
System.out.println("Category: " + dolly.getCategory());
```

另外你也可以通过复写 `clone()`方法来定制克隆行为。

**何时使用？**

当所需对象和某个现存对象非常相似时，或者当创建操作相比克隆花销更大时。