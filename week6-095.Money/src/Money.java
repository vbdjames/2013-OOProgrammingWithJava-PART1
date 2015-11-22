
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;
        return new Money(euros, cents);
    }

    public boolean less(Money compared) {
        return (this.euros * 100 + this.cents)
                < (compared.euros * 100 + compared.cents);
    }

    public Money minus(Money decremented) {
        if (less(decremented)) { // this < decremented
            return new Money(0, 0);
        }
        int euros = this.euros - decremented.euros;
        int cents = euros * 100 + this.cents - decremented.cents;
        return new Money(0, cents);
    }

}
