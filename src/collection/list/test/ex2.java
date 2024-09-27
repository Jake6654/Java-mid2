package collection.list.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int num = sc.nextInt();
        while (num != 0) {
            list.add(num);
            num = sc.nextInt();
        }
        System.out.println(list);
    }
}
