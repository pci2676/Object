package theater.customer;

public class Customer {
    private Long id;
    private String name;

    public Customer(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
