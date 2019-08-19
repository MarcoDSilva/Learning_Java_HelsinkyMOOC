
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

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

    public int differenceInYears(MyDate compareDate) {
        //if the object being compared has the bigger year the conditional starts
        if (compareDate.year > this.year) {
            if (compareDate.year > this.year) {
                if (compareDate.month >= this.month) {
                    if (compareDate.day >= this.day) {
                        return compareDate.year - this.year;
                    }
                    return compareDate.year - this.year - 1;
                } else {
                    return compareDate.year - this.year - 1;
                }
            }
        } else { //if the actual obj has the bigger year of the 2 conditional is this
            if (this.year > compareDate.year) {
                if (this.month >= compareDate.month) {
                    if (this.day >= compareDate.day) {
                        return this.year - compareDate.year;
                    }
                    return this.year - compareDate.year - 1;
                } else {
                    return this.year - compareDate.year - 1;
                }
            }
        }
        //if there is no greater year, it's obviously 0
        return 0;
    }
}
