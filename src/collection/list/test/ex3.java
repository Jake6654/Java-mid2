package collection.list.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int num = sc.nextInt();
        while (num != 0) {
            list.add(num);
            total += num;
            num = sc.nextInt();
        }
        double average = total/ list.size();
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);


    }
}
