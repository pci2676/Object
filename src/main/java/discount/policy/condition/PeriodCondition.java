package discount.policy.condition;

import movie.Screening;

public class PeriodCondition extends DiscountCondition {
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
