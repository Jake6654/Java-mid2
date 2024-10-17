package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {

        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());


    }

    private static void run(Map<String,Integer> map){
        System.out.println("map = " + map.getClass());
        map.put("C",10);
        map.put("B",20);
        map.put("A",30);
        map.put("1",40);
        map.put("2",50);

        Set<String> keySet = map.keySet();
        keySet.stream()
                .forEach(s -> System.out.println("key = " + s + ", value = " + map.get(s)));
        System.out.println();
    }

}
