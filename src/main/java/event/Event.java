package event;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String subject;
    private LocalDateTime from;
    private Duration duration;

    public Event(final String subject, final LocalDateTime from, final Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    public boolean isSatisfied(final RecurringSchedule recurringSchedule) {
        if (from.getDayOfWeek() != recurringSchedule.getDayOfWeek() ||
                !from.toLocalTime().equals(recurringSchedule.getFrom()) ||
                !duration.equals(recurringSchedule.getDuration())) {
            // 부수 효과를 일으킨다. 이유는 명령과 쿼리가 동일한 메서드에서 호출되었기 때문!
            //            reschedule(recurringSchedule);
            return false;
        }
        return true;
    }

    public void reschedule(final RecurringSchedule recurringSchedule) {
        from = LocalDateTime.of(from.toLocalDate().plusDays(daysDistance(recurringSchedule)), recurringSchedule.getFrom());
        duration = recurringSchedule.getDuration();
    }

    private long daysDistance(final RecurringSchedule recurringSchedule) {
        return recurringSchedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
    }
}
