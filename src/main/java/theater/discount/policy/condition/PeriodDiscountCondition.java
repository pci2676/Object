package theater.discount.policy.condition;

import theater.movie.Screening;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PeriodDiscountCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public PeriodDiscountCondition(DayOfWeek dayOfWeek, LocalDateTime startTime, LocalDateTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime()) >= 0;
    }
}
