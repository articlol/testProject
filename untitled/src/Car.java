import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Car {
    private String number;
    private int year;

    public Car(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }


    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        /*
        for (Car car : cars) {          ----   стандартно
        if (car.getYear() > 2010) {
            String number = car.getNumber();
            if (number != null && !number.isEmpty())
                System.out.println(number);
        }
        */
        cars.stream()                     //    -------  использование steam api
                .filter(y -> y.getYear() > 2010)
                .map(Car::getNumber)
                .filter(Objects::nonNull)
                .filter(x -> !x.isEmpty())
                .forEach(System.out::println);


    }
}

