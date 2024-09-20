package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        // 코드 추가
        if (size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 한 줄로 리팩토링 가능, copyOf 을 통해 기존 배열의 element 을 토대로 새로운 길이의 배열을 만들고
        // 기존 배열의 참조값을 바꾼다
        elementData = Arrays.copyOf(elementData, newCapacity);


        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
//        Object[] newArr = new Object[newCapacity];
//        // 기존 배열의 데이터를 복사
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }
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
