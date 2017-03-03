🏭 工厂方法(Factory Method)
--------------

现实案例
> 考虑人事招聘经理的情况。一个人不可能参与对每个职位的面试。根据职位空缺，她必须决定将面试工作委派给不同的人来完成。

简单来说
> 它提供了一种能将实例化逻辑委派到子类中完成的方式。

Wikipedia 上描述为
> 在基于类的编程中，工厂方法模式是一种创建型模式，它无需指定将要创造的对象的具体类，只使用工厂中的各种方法就能处理对象创建的问题。对象的创建是通过调用工厂方法而非构造器来完成的，工厂方法—要么在接口中定义然后由子类实现，要么是在基类中实现然后被继承类重载。
 
 **编程示例**
 
继续上面的人事招聘经理的例子。首先定义面试接口并给出了几个实现

```php
interface Interviewer {
    public function askQuestions();
}

class Developer implements Interviewer {
    public function askQuestions() {
        echo 'Asking about design patterns!';
    }
}

class CommunityExecutive implements Interviewer {
    public function askQuestions() {
        echo 'Asking about community building';
    }
}
```

现在让我们创建 `HiringManager`

```php
abstract class HiringManager {
    
    // Factory method
    abstract public function makeInterviewer() : Interviewer;
    
    public function takeInterview() {
        $interviewer = $this->makeInterviewer();
        $interviewer->askQuestions();
    }
}
```

现在任何子类都可以扩展并提供所需的面试接口

```php
class DevelopmentManager extends HiringManager {
    public function makeInterviewer() : Interviewer {
        return new Developer();
    }
}

class MarketingManager extends HiringManager {
    public function makeInterviewer() : Interviewer {
        return new CommunityExecutive();
    }
}
```

然后可以这样使用

```php
$devManager = new DevelopmentManager();
$devManager->takeInterview(); // Output: Asking about design patterns

$marketingManager = new MarketingManager();
$marketingManager->takeInterview(); // Output: Asking about community building.
```

**何时使用？**

适合时当类中存在一些通用操作，但是所需的子类是在运行时才动态决定的情况。换句话说，即当客户无法知道所需的确切子类时。