package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가 (순서 보장x)
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        // 특정 학생의 값 조회 (키를 통해 value 값 출력)
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("keySet 활용");
        Set<String> keys = studentMap.keySet();
        for (String key : keys) { // map 의 모든 데이터를 출력
            Integer integer = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + integer);
        }

        System.out.println("entrySet 활용"); // key 와 value 쌍으로 이루어진 간단한 객체이다
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", values = " + value);
        }


        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        values.stream()
                .forEach(s -> System.out.println("value = " +s));
    }
}
