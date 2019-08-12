
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceFromUser) {
        this.balance = balanceFromUser;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }


public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int count) {
       if(count > 0 && count <= this.upperLimit)
       {
           this.value = count;
       }
    }
}