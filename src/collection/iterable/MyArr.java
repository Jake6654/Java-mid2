package collection.iterable;

import java.util.Iterator;

public class MyArr implements Iterable<Integer> {

    private int[] numbers;

    @Override
    public Iterator<Integer> iterator() {
        // 생성자의 argument에 순회시킬 배열을 넣는다
        return new MyArrayIterator(numbers);
    }

    public MyArr(int[] numbers) {
        this.numbers = numbers;


    }
}
