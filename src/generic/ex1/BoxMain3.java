package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        // 생성 시점의 T의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<>();
        // integerBox.setValue("1000"); // Integer type 만 허용, 컴파일 오류
        integerBox.setValue(10);
        System.out.println("Interger = " + integerBox.getValue());

        // String type
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("hello world");
        // stringBox.setValue(100); 컴파일 오류, String type 만 입력가능
        System.out.println(stringBox.getValue());

        // 원하는 모든 타입 사용가능
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.setValue(1.4);
        System.out.println(doubleGenericBox.getValue());

    }
}
