package generic.test.ex4;

public class Main {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        GenericMethod.<Integer>genericMethod(i); // <Integer> 를 넣게 되면 메서드가 Integer type 으로 바뀐
        // 결국 Integer 타입이 반한됨
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Double Double = GenericMethod.<Double>numberMethod(20.0); // numberMethod 는 숫자형 외는 대입하지 못한다

        // 타입 추론, 타입 인자 생략
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Double Double2 = GenericMethod.numberMethod(20.0);

    }
}