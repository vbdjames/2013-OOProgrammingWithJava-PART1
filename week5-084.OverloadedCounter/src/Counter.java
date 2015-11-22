
public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        increase(1);
    }

    public void increase(int by) {
        if (by > 0) {
            this.value += by;
        }
    }

    public void decrease() {
        decrease(1);
    }

    public void decrease(int by) {
        if (by < 0) {
            return;
        }
        
        this.value -= by;
        
        if (this.check && this.value < 0) {
            this.value = 0;
        }
    }
}
