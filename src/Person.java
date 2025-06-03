public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Address getHome() { return home; }

    public String toString() {
        return lastName + " " + firstName + ", " + home.toString();
    }
}


