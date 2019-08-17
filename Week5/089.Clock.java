
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(hoursAtBeginning);
        this.minutes = new BoundedCounter(minutesAtBeginning);
        this.seconds = new BoundedCounter(secondsAtBeginning);

        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        // Clock advances by one second
        if (this.seconds.getValue() == 59) {
            if (this.minutes.getValue() == 59) {
                this.hours.next();
            }
            this.minutes.next();
        }
        this.seconds.next();
    }

    @Override
    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
