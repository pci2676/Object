package theater.movie;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Screening {
    private Long id;
    private Movie movie;
    private LocalDateTime whenScreening;

    public boolean isSequence(Long sequence) {
        return id.equals(sequence);
    }

    public DayOfWeek getDayOfWeek() {
        return whenScreening.getDayOfWeek();
    }

    public LocalDateTime getStartTime() {
        return whenScreening;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

}
