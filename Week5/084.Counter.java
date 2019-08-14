
public class Counter {

    private int value;
    boolean check;

    public Counter() {
        this(0, false);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease() {
        if (this.check) {
            if (this.value > 0) {
                this.decrease(1);
            }
        } else {
            this.decrease(1);
        }

    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (!this.check) {
                this.value -= decreaseAmount;
            } else if (this.check && this.value - decreaseAmount > 0) {
                this.value -= decreaseAmount;
            } else {
                this.value = 0;
            }
        }

    }

}