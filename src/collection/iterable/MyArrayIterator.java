package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex]; // 0 시작
    }

    @Override
    public boolean hasNext() { // 배열의 인덱스에 마지막에 도달하면 false 반환
        return currentIndex < targetArr.length - 1;

    }
}
