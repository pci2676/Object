package theater.movie;

import theater.discount.policy.DiscountPolicy;

import java.time.Duration;

public class Movie {
    private Long id;
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(Long id, String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.id = id;
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
