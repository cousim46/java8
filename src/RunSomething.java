/**
 * 자바 8에서 제공해주는 기능
 *
 * 함수형 인터페이스 : 추상 메서드가 1개만 존재하는 인터페이스,
 * static, default메서드가 있더라도 추상메서드가 1개만 존재하면 함수형 인터페이스
 *
 * @FunctionalInterface <-를 사용하여 함수형 인터페이스 생
 *
 * static 메서드 지원
 *
 * default 메서드 지원
 * */
@FunctionalInterface
public interface RunSomething {
    int doIt(int num);

    static void printName() {
        System.out.println("Hoe");
    }

    default void printAge() {
        System.out.println("27");
    }
}
