import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Function
 * - R apply(T t) -> 매개변수 T를 받아 R을 반환
 * - <V> Function<V, R> compose(Function<? super V, ? extends T> before)
 *      - compose 매개변수에 있는 로직을 실행 후 나온 결과값으로 compose를 호출한 메서드 실행
 *
 * - <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
 *      - andThen을 호출한 인터페이스를 실행 후 매개변수에 있는 메서드 실행
 *
 *
 * Consumer
 *  - void accept(T t) -> T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
 *
 *  Supplier<T>
 *   - T get() -> T 타입의 값을 제공하는 함수 인터페이스
 *  Predicate
 *   - boolean test(T t) -> T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
 *    - and, or 을 이용하여 조합이 가능함.
 * UnaryOperator
 * - Function<T,R>의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스
 * BinaryOperator<T,U,R>의 특수한형태로, 동일한 타입의 입력값 두개를 받아 리턴하는 함수 인터페이스
 * */
public class Java8ProvideInterface {

    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus = (number) -> number + 10;
        System.out.println(plus.apply(10));

        Function<Integer, Integer> multiply2 = (number) -> number * 2;
        System.out.println(multiply2.apply(10));

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(10));

        System.out.println(plus10.andThen(multiply2).apply(10));

        // Consumer
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        //Supplier
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        //Predicate
        Predicate<String> startsWithHoe = (str) -> str.startsWith("Hoe");
        System.out.println(startsWithHoe.test("test"));
        Predicate<Integer> isEven = (i) -> i % 2 == 0;
        System.out.println(isEven.test(5));

        //UnaryOperator
        UnaryOperator<Integer> inputEqResult = (i) -> i + 10;
    }

}
