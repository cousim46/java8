/**
 * 자바에서 함수형 프로그래밍
 * - 함수를 First class object로 사용할 수 있다.
 * - 순수함수(pure function)
 *      - 사이드 이팩트 만들 수 없다(함수 밖에 있는 값을 변경하지 못한다.)
 *      - 상태가 없다(함수 밖에 정의되어 있는)
 * - 고차함수 : 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수 있다.
 * - 불변성
 * */
public class Foot {

    public static void main(String[] args) {
        RunSomething runSomething = new RunSomething() {
            @Override
            public int doIt(int num) {
                return num + 10;
            }
        };
        System.out.println(runSomething.doIt(10));
        System.out.println(runSomething.doIt(20));
        System.out.println(runSomething.doIt(30));
        System.out.println(runSomething.doIt(10));
    }
}
