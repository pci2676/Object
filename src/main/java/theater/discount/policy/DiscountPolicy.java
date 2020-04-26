package theater.discount.policy;

import theater.discount.condition.DiscountCondition;
import theater.movie.Money;
import theater.movie.Screening;

import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {

    private List<DiscountCondition> discountConditions;

    public DiscountPolicy(DiscountCondition... discountConditions) {
        this.discountConditions = Arrays.asList(discountConditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : discountConditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening); // Template Method Pattern 중간에 필요한 처리를 자식 클래스에게 위임하는 패턴
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
