package theater.discount.policy.condition;

import theater.movie.Screening;

public class SequenceDiscountCondition implements DiscountCondition {
    private Long sequence;

    public SequenceDiscountCondition(Long sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
