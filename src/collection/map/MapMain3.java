package collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA",50);

        // 학생이 없는 경우에만 추가1
        if (!studentMap.containsKey("studentA")){
            studentMap.put("studentA",100);
        }
        // 학생이 없는 경우에만 추가2
        studentMap.putIfAbsent("studentA",100); // 있음으로 추가가 되지 않는다
        studentMap.putIfAbsent("studentB",60);
        System.out.println(studentMap);


    }
}
