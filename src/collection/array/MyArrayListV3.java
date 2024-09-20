package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        if (size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }
    // 코드 추가
    public void add(int index, Object o) {
        if (size == elementData.length){
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = o;
        size++;


    }
    // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    public void shiftRightFrom(int index) {
        for (int i = size; i >index; i--) {
            elementData[i] = elementData[i-1];
        }
    }



    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
        }


    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element){
        Object oldValue = get(index); // 기존의 값을 반환해줄 것 이다
        elementData[index] = element;
        return oldValue;
    }

    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);
        // 데이터 이동
        size--; // 사이즈 하나 줄이고 마지막 인덱스를 null 으로 값을 설정
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size -1; i++) {
            elementData[i] = elementData[i+1];
        }
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
