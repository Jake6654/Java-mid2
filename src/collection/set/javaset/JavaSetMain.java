package collection.set.javaset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {
    public static void main(String[] args) {

        run(new HashSet<String>()); // hash 알고리즘을 통해 데이터 저장
        run(new LinkedHashSet<String>()); // 입력 순서대로 저장
        run(new TreeSet<String>()); // 작은 값 -> 큰 정렬 순서대로 저장
    }

    private static void run(Set<String>set){
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        set.stream()
                .forEach(element -> System.out.print(element+" "));
        System.out.println();

    }
}
