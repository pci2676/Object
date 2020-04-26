package theater.reservation;

import theater.customer.Customer;
import theater.movie.Money;
import theater.movie.Screening;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audiencCount;

    public Reservation(final Customer customer, final Screening screening, final Money fee, final int audiencCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audiencCount = audiencCount;
    }
}
