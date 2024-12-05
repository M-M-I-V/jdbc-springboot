package dev.mmiv.jdbc;

public class Customer {
    private final int id;
    private final String firstName;
    private final String lastName;

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
