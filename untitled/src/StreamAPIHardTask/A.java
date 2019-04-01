package StreamAPIHardTask;

public class A {
    private final int value;

    public A(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "A" + value;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof A)) {
            return false;
        }
        return value == ((A) o).value;
    }
}
