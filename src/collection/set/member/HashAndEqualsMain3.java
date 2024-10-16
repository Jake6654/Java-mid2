package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        // 해쉬코드와 equals 구현 x
        System.out.println("m1.hashCode() = " + m1.hashCode()); // different hashCode
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // false

        //중복 등록 X
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색실패 (해쉬코드가 다른)
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
