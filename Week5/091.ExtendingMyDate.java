
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {

        if (this.day + 1 <= 30) {
            this.day++;
        } else if (this.month == 12) {

            if (this.day == 30) {
                this.day = 1;
                this.month = 1;
                this.year++;
            }
        } else {
            this.day = 1;
            this.month++;
        }
    }


    /*verifies the day and month to advance or reset day and month
    if sum of day with number of days is under or equal to 30, just sums it
    if not, means the day is going to start from 1 because it's a new month, so we advance the month and reset the days
    we verify as well the month, if it's december and the day is the last, year advances, month and day reset
    else, just advance the days until day 30
     */
    public void advance(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            advance();
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);
        return newMyDate;
    }

}
