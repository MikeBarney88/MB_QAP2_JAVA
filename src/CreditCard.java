public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor - creates own objects using copy constructor
    public CreditCard(Person newCardHolder, Money limit) {
        if (newCardHolder == null || limit == null) {
            throw new Error("Card holder and limit cannot be null");
        }
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.0);
    }

    // Accessor methods (Task #2.3)
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get owner information as String (Task #2.4)
    public String getPersonals() {
        return owner.toString();
    }

    // Charge method (Task #2.5)
    public void charge(Money amount) {
        if (amount == null) {
            throw new Error("Charge amount cannot be null");
        }

        Money newBalance = balance.add(amount);

        // Check if charge would exceed credit limit
        if (newBalance.compareTo(creditLimit) > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        }
    }

    // Payment method (Task #2.6)
    public void payment(Money amount) {
        if (amount == null) {
            throw new Error("Payment amount cannot be null");
        }

        // Subtract payment from balance, but can't go below zero
        if (amount.compareTo(balance) >= 0) {
            balance = new Money(0.0);
        } else {
            balance = balance.subtract(amount);
        }
        System.out.println("Payment: " + amount);
    }
}

