package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        elementData[size] = e;
        size++;
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element){
        Object oldValue = get(index); // 기존의 값을 반환해줄 것 이다
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])){
                return i;
            }
        }
        return -1; // 없으면 -1
    }
    @Override
    public String toString(){
        // [1, 2, 3, null, null] // size =3
        // [1, 2, 3] size 의 크기만큼 반환
        return Arrays.toString(Arrays.copyOf(elementData,size)) + "size= " + size+ ", " +
                "capacity= " + elementData.length; // 특정 배열을 특정 크기만큼만 copy 해서 반환해준다

    }
}
