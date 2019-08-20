
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
        Money extra = new Money(added.euros + this.euros, added.cents + this.cents);
        return extra;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }

        return false;
    }

    public Money minus(Money decremented) {
        int moneyrino = this.euros - decremented.euros;
        int centrino = 0;
        int temp = 0;

        if (this.cents - decremented.cents < 0) {
            temp = decremented.cents - this.cents;
            centrino = 100 - temp;
            moneyrino -= 1;
        }

        if (moneyrino < 0) {
            moneyrino = 0;
        }

        Money extra = new Money(moneyrino, centrino);
        return extra;
    }
}
