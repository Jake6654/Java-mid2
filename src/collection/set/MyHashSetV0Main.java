package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 hashSetV0 = new MyHashSetV0();
        hashSetV0.add(1); // O(1)
        hashSetV0.add(2); // O(n) add element after checking it contains element
        hashSetV0.add(3);
        hashSetV0.add(4);
        hashSetV0.add(5);

        System.out.println(hashSetV0);

        boolean result = hashSetV0.add(5);
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(hashSetV0);

        System.out.println("hashSetV0.contains(4) = " + hashSetV0.contains(4));
        System.out.println("hashSetV0.contains(99) = " + hashSetV0.contains(99));


    }
}
