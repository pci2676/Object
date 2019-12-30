package discount.policy.condition;

import movie.Screening;

public abstract class DiscountCondition {
    public abstract boolean isSatisfiedBy(Screening screening);
}
