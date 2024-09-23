package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T t) { // 타입 매개변수에 대해서 상한을 줄 수 있다
        System.out.println("bound print: " + t);
        return t;

    }
}
