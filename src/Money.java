public class Money {
    private long dollars;
    private long cents;

    // Constructor with amount as double
    public Money(double amount) {
        if (amount < 0) {
            throw new Error("Amount cannot be negative");
        }

        // Convert double to dollars and cents
        long totalCents = Math.round(amount * 100);
        this.dollars = totalCents / 100;
        this.cents = totalCents % 100;
    }

    // Copy constructor - Task #1
    public Money(Money otherObject) {
        if (otherObject == null) {
            throw new Error("Cannot copy null Money object");
        }
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Add method
    public Money add(Money otherAmount) {
        if (otherAmount == null) {
            throw new Error("Cannot add null Money object");
        }

        long totalCents = (this.dollars * 100 + this.cents) +
                (otherAmount.dollars * 100 + otherAmount.cents);

        return new Money(totalCents / 100.0);
    }

    // Subtract method
    public Money subtract(Money otherAmount) {
        if (otherAmount == null) {
            throw new Error("Cannot subtract null Money object");
        }

        long totalCents = (this.dollars * 100 + this.cents) -
                (otherAmount.dollars * 100 + otherAmount.cents);

        if (totalCents < 0) {
            throw new Error("Result cannot be negative");
        }

        return new Money(totalCents / 100.0);
    }

    // CompareTo method
    public int compareTo(Money otherObject) {
        if (otherObject == null) {
            throw new Error("Cannot compare to null Money object");
        }

        long thisTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = otherObject.dollars * 100 + otherObject.cents;

        if (thisTotalCents < otherTotalCents) return -1;
        if (thisTotalCents > otherTotalCents) return 1;
        return 0;
    }

    // Equals method
    public boolean equals(Money otherObject) {
        if (otherObject == null) return false;
        return (this.dollars == otherObject.dollars && this.cents == otherObject.cents);
    }

    // toString method
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}


