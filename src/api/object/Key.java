package api.object;

public class Key {

    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Key) {
            Key compareKey = (Key) obj;
            return this.number == compareKey.number;

        }
        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
