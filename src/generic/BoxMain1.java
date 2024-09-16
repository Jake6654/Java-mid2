package generic;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox  = new IntegerBox();
        integerBox.setValue(10); // 오토 박싱: int 가 Integer로 자동 변환된다
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);
    }
}
