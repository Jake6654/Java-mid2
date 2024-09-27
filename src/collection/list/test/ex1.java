package collection.list.test;

import java.util.ArrayList;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int [] students = {90, 80, 70, 60, 50};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(90, 80, 70, 60, 50));

        int total = 0;
        for (Integer integer : list) {
            total += integer;
        }

        double average = (double) total / list.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

    }
}
