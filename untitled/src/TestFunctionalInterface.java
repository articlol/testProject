import java.util.Scanner;
import java.util.function.*;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        Operator<Integer> lambda = (value1, value2) -> value1 * value2;
        System.out.println(lambda.getResult(273, 659)); // Example

        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(25));  // Method test - boolean test(T t);  проверят соблюдение условия.

        Consumer<Integer>consumer = x -> System.out.println(x);
        consumer.accept(1000);                   // Method accept - void accept(T t); выполняет некоторое действие ничего не возвращая.

        Function<Integer, String> function = x -> String.valueOf(x) + "евро";
        System.out.println(function.apply(10000));  // Method apply - R apply(T t); преобразует переменную из первого типа во второй.

        Supplier<String> stringSupplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи что-нибудь");
            return scanner.nextLine();
        };
        System.out.println(stringSupplier.get());     // Method get - T get(); не принимает никаких аргументов, но должен возвращать объект типа T

        UnaryOperator<Double>unaryOperator = value -> Math.sqrt(value);
        System.out.println(unaryOperator.apply(16.0));  // Method apply - T apply(T t); принимает в качестве параметра объект типа T, выполняет над ними операции и возвращает результат операций в виде объекта типа T.

        BinaryOperator<Double> binaryOperator = (value1, value2) -> Math.pow(value1,value2);
        System.out.println(binaryOperator.apply(4.0, 9.0)); // Method apply - T apply(T t1, T t2); принимает в качестве параметра два объекта типа T, выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T
    }
}
@FunctionalInterface
interface Operator<T>{
    int getResult (T value1, T value2);
}

