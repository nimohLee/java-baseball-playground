package study;

public class Ball {
    private int position;
    private int value;

    public Ball(int position, int value) {
        this.position = position;
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ball) {
            Ball target = (Ball) obj;
            if (target.value == this.value) {
                return true;
            }
            return false;
        }

        return false;
    }
}
