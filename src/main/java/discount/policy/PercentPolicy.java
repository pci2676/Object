package discount.policy;

import movie.Money;
import movie.Screening;

public class PercentPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return null;
    }
}
