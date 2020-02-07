package theater.discount.policy.condition;

import theater.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
