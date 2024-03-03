import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * 람다
 * - (인자 리스트) -> {바디}
 * 인자 리스트
 * - 인자 없을때 : ()
 * - 인자가 한개일때 (one) 또는 one
 * - 인자가 여러개 일때 (one, two,..)
 * - 인자의 타입은 생략가능, 컴파일러가 추론하지만 명시할 수 있음 (Integer one, Integer two,..)
 *
 * 바디
 * - 화살표 오른쪽에 함수 본문을 정의
 * - 여러 줄일 경우 {}를 사용하여 묶음
 * - 한줄인 경우에 생략 가능, return도 생략 가능
 *
 * 변수 캡쳐(Variable Capture)
 * - 로컬 변수 캡쳐
 *      - final이거나 effective final인 경우에만 참조 가능
 *      - 그렇지 않을 경우 concurrency 문제가 발생할 수 있어 컴파일러가 방지
 * - effective final
 *      - 자바 8부터 지원하는 기능으로 사실상 final 변수
 *      - final 키워드 사용하지 않은 익명 클래스 구현체 또는 람다에서 참조
 * - 익명 클래스 구현체와 달리 쉐도윙 하지 않음
 *      - 익명 클래스는 새로운 스코프를 만들지만 람다는 람다를 감씨ㅏ고 있는 스코프와 같음
 * */
public class Lambda {

    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i + 2;

        Lambda lambda = new Lambda();
        lambda.run();

    }
    private void run() {
        int baseNumber = 10;
        IntConsumer print = (i) -> System.out.println(i + baseNumber);
        print.accept(10);
    }

}
