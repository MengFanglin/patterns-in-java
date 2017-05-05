package im.dashen.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

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
