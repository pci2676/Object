package movie;

public class Movie {
    private Long id;
    private String title;
    private Money fee;

    public Movie(Long id, String title, Money fee) {
        this.id = id;
        this.title = title;
        this.fee = fee;
    }

    public Money getFee() {
        return fee;
    }
}
