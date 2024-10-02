package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer [] inputArray = new Integer[10];
        inputArray[1] = 1; // 데이터의 값 자체를 배열의 인덱스로 사용했다. 하지만 배열에 낭비되는 공간이 많이 생긴다
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = inputArray[8];
        System.out.println(searchValue);

    }
}
