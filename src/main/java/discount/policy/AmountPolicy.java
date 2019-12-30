package discount.policy;

import movie.Money;
import movie.Screening;

public class AmountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return null;
    }
}
