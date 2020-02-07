package theater.movie;

import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);
    private BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public static Money wons(long wons) {
        return new Money(BigDecimal.valueOf(wons));
    }

    public static Money wons(double wons) {
        return new Money(BigDecimal.valueOf(wons));
    }

    public Money plus(Money money) {
        return new Money(this.amount.add(money.amount));
    }

    public Money minus(Money money) {
        return new Money(this.amount.subtract(money.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Money other) {
        return this.amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return this.amount.compareTo(other.amount) >= 0;
    }
}
