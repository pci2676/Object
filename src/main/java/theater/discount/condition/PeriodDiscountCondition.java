package theater.discount.condition;

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

    //이 경우 디미터 법칙을 준수하려는 생각에 할인로직을 Screening으로 밀어 넣으면 오히려 응집도가 떨어지고 변경에 취약해진다.
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime()) >= 0;
    }
}
