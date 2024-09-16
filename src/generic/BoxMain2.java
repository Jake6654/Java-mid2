package generic;

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

    }
}
