package theater.reservation;

import theater.customer.Customer;
import theater.movie.Money;
import theater.movie.Screening;

public class ReservationAgency {

    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
