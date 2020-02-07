package theater.reservation;

import theater.movie.Screening;

import java.time.LocalDateTime;

public class Reservation {
    private Long id;
    private Screening screening;
    private LocalDateTime createdTime;
}
