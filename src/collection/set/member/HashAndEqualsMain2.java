package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        // 해쉬코드만 구현
        System.out.println("m1.hashCode() = " + m1.hashCode()); // different hashCode
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // false

        //중복 등록
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색실패(객체의 참조값을 비교하기 때문에 identity 비교)
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
