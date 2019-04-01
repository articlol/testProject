package StreamAPIHardTask;

import java.util.ArrayList;
import java.util.List;

public class B {
    private final List<A> germanCars = new ArrayList<>();
    private final int value;

    public B(int value) {
        this.value = value;
    }

    public B add(A a) {
        germanCars.add(a);
        return this;
    }

    public List<A> getGermanCars() {
        return new ArrayList<>(germanCars);
    }

    @Override
    public String toString() {
        return "B" + value + " " + germanCars;
    }
}

