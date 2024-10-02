package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        // 입력: {1, 2, 5, 8, 14, 99}
        Integer [] inputArray = new Integer[100];
        inputArray[1] = 1; // 데이터의 값 자체를 배열의 인덱스로 사용했다. 하지만 배열에 낭비되는 공간이 많이 생긴다
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = inputArray[99]; // O(1)
        System.out.println(searchValue);

    }
}
