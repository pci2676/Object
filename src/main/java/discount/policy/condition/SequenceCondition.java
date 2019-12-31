package discount.policy.condition;

import movie.Screening;

public class SequenceCondition implements DiscountCondition {
    private Long sequence;

    public SequenceCondition(Long sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
