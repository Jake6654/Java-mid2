package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // 두개의 set 에서 합잡합을 구하는 메서드

        // 교집합
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // 차집합
        HashSet<Integer> differences = new HashSet<>(set1);
        differences.removeAll(set2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + differences);



    }
}
