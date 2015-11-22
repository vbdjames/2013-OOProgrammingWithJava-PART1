
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared) {
        int yearDiff=100;

        if (earlier(compared)) {
            yearDiff = compared.year - this.year;
            if (this.month > compared.month
                    || this.month == compared.month && this.day > compared.day) {
                yearDiff--;
            }

        } else {
            yearDiff = this.year - compared.year;
            if (this.month < compared.month
                    || this.month == compared.month && this.day < compared.day) {
                yearDiff--;
            }
        }
        return yearDiff;
    }
}