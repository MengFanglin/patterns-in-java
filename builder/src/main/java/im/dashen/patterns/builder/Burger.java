package im.dashen.patterns.builder;

public class Burger {
    private int size;
    private String cheese;
    private String pepperoni;
    private String lettuce;
    private String tomato;


    public Burger(BurgerBuilder builder) {
        size = builder.getSize();
        cheese = builder.getCheese();
        pepperoni = builder.getPepperoni();
        lettuce = builder.getLettuce();
        tomato = builder.getTomato();
    }


    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", cheese='" + cheese + '\'' +
                ", pepperoni='" + pepperoni + '\'' +
                ", lettuce='" + lettuce + '\'' +
                ", tomato='" + tomato + '\'' +
                '}';
    }
}
