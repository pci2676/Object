package theater.discount.policy;

import theater.discount.policy.condition.DiscountCondition;
import theater.movie.Money;
import theater.movie.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountMoney;

    public AmountDiscountPolicy(Money discountMoney, DiscountCondition... discountConditions) {
        super(discountConditions);
        this.discountMoney = discountMoney;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountMoney;
    }
}
