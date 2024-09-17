package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        System.out.println(integerBox.getValue()); // Object type
        Integer integer = (Integer) integerBox.getValue(); // 다운 캐스팅하여 integer 값 받기
        System.out.println(integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue(); // Object  -> String 캐스팅
        System.out.println("str = " +str);

        // 잘못된 타입의 인수 전달 시
        integerBox.setValue("asdad");
        // Object 타입의 변수라 문자열도 받을 수 있지만 캐스팅을 할때 오류가 발생한다
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}
