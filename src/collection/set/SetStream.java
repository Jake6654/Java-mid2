package collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SetStream {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));

        integers.stream()
                .filter(s -> s % 2 == 0)
                .forEach(s -> System.out.println(s));
    }
}
