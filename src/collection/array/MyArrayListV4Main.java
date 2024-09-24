package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> arrayListV4 = new MyArrayListV4<>();
        arrayListV4.add("a");
        arrayListV4.add("b");
        arrayListV4.add("c");
        String string = arrayListV4.get(0);
        System.out.println("String = " + string);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        // intList.add("asd"); 오류 발생
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}
