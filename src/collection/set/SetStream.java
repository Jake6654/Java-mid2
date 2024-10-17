package collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetStream {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));

        integers.stream()
                .filter(s -> s % 2 == 0)
                .forEach(s -> System.out.println(s));
        // 스트림을 사용하더라도 원본 프레임워크에 영향을 주지 않는다
        System.out.println(integers);
    }
}
