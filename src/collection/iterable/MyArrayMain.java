package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArr myArr = new MyArr(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArr.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
