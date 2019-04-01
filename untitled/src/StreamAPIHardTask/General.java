package StreamAPIHardTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class General {
    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(2);
        A a3 = new A(3);

        B b1 = new B(1).add(a1).add(a2);
        B b2 = new B(2).add(a3).add(a2);

        C c1 = new C(1).add(b1).add(b2);
        C c2 = new C(2).add(b2);

        List<C> composition = Arrays.asList(c1, c2);
        System.out.println("Initial composition: " + composition);
        Map<A, List<B>> result = composition.stream()
                .flatMap(item -> item.getGermanCars().stream())
                .flatMap(item -> item.getGermanCars().stream().map(child -> new Pair<>(item, child)))
                .collect(
                        Collectors.toMap(
                                Pair::getY,
                                pair -> Collections.singletonList(pair.getX()),
                                (left, right) -> Stream.concat(left.stream(), right.stream()).collect(Collectors.toList())
                        )
                );
        System.out.println("Result: " + result);
    }
}
