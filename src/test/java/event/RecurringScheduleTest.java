package event;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RecurringScheduleTest {

    @Test
    void name() {
        //given
        RecurringSchedule recurringSchedule = new RecurringSchedule("회의", DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), Duration.ofMinutes(30));
        Event meeting = new Event("회의", LocalDateTime.of(2019, 5, 8, 10, 30), Duration.ofMinutes(30));

        //then
        assertThat(meeting.isSatisfied(recurringSchedule)).isTrue();
    }

    @Test
    void name1() {
        //given
        RecurringSchedule recurringSchedule = new RecurringSchedule("회의", DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), Duration.ofMinutes(30));
        Event meeting = new Event("회의", LocalDateTime.of(2019, 5, 9, 10, 30), Duration.ofMinutes(30));

        //then
        assertAll(
                () -> assertThat(meeting.isSatisfied(recurringSchedule)).isFalse()
//                () -> assertThat(meeting.isSatisfied(recurringSchedule)).isTrue()
        );
    }
}