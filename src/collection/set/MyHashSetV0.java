package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int [] elementData = new int[10]; // 일단 배열 사용
    private int size = 0;

    // O(n)
    public boolean add(int value){
        if (contains(value)){
            return false;
        }
        elementData[size] = value;
        size++;
        return  true;
    }

    // O(n) : iterate element
    public boolean contains(int value) {
        for (int element : elementData) {
            if (element == value){
                return true;
            }
        }
         return false;
        }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        // 배열의 사이즈 만큼만 복사 후 리턴
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}

