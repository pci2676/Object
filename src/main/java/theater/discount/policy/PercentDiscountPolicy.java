package theater.discount.policy;

import theater.discount.policy.condition.DiscountCondition;
import theater.movie.Money;
import theater.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... discountConditions) {
        super(discountConditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee()
                .times(percent);
    }
}
