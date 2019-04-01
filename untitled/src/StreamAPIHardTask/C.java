package StreamAPIHardTask;

import java.util.ArrayList;
import java.util.List;

public class C {
    private final List<B> germanCars = new ArrayList<>();
    private final int value;

    public C(int value) {
        this.value = value;
    }

    public C add(B b) {
        germanCars.add(b);
        return this;
    }

    public List<B> getGermanCars() {
        return new ArrayList<>(germanCars);
    }

    @Override
    public String toString() {
        return "C" + value + " " + germanCars;
    }
}
