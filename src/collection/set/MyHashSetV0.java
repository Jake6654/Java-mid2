package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value){ // O(n)
        // 검증 로직
        if (contains(value)){
            return false;
        }
        // 중복이 없으면 값을 저장 and 사이즈 +1
        elementData[size]  = value;
        size++;
        return true;
    }

    public boolean contains(int value) { // O(n)
        for (int data : elementData) {
            if (data == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
                ", size=" + size +
                '}';
    }
}
