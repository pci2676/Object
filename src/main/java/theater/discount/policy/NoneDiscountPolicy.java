package theater.discount.policy;

import theater.movie.Money;
import theater.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(final Screening screening) {
        return Money.ZERO;
    }
}
