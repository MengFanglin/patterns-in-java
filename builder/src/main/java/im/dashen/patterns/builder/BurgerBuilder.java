package im.dashen.patterns.builder;

public class BurgerBuilder {
    private int size;
    private String cheese;
    private String pepperoni;
    private String lettuce;
    private String tomato;

    public BurgerBuilder(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getCheese() {
        return cheese;
    }

    public BurgerBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public String getPepperoni() {
        return pepperoni;
    }

    public BurgerBuilder setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public String getLettuce() {
        return lettuce;
    }

    public BurgerBuilder setLettuce(String lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public String getTomato() {
        return tomato;
    }

    public BurgerBuilder setTomato(String tomato) {
        this.tomato = tomato;
        return this;
    }

    public Burger build() {
        return new Burger(this);
    }
}
