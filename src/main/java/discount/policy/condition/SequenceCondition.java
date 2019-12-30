package discount.policy.condition;

import movie.Screening;

public class SequenceCondition extends DiscountCondition {
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
