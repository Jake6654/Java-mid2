package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaIterableMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(3);

    }
}
