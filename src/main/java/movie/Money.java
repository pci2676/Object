package movie;

public class Money {
    public static final Money ZERO = new Money(0);

    private double money;

    public Money(double money) {
        this.money = money;
    }
}
