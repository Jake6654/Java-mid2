package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2 ,5, 8, 14, 99}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; // [] 을 추가해줌으로써 배열의 요소가 모두 linkedList<Integer> 가 된다
        System.out.println(Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>(); // 배열 하나하나 안에 linked list 를 생성
        }

        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket.contains + (" +searchValue + ") = " + contains);

    }


    private static void add(LinkedList<Integer> [] buckets, int value){
        int hashIndex = hashIndex(value); // 먼저 해쉬 인덱스 구현 O(1)
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)){ // 중복이 없으면 O(n) why 중복 허용 x?
            bucket.add(value); // 이 구조로 set 을 만들거기 때문이다
        }
    }
    private static boolean contains(LinkedList<Integer> [] buckets , int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // buckets 의 hashIndex 의 LinkedList 를 전달받는다
        return bucket.contains(value); // bucket 은 LinkedList 이니 contains 메서드를 사용할 수 있다.

    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }


}
