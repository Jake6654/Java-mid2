package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        // 마지막에 추가 O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3,"addLast"); // O(n)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0,"addFirst"); //O(n)
        System.out.println(list);

        // 삭제
        Object removed1 = list.remove(list.size() - 1);// removeLast O(1)
        System.out.println("removed(4) = " +removed1);

        Object removed2 = list.remove(0); // removeFirst
        System.out.println("removed(0) = " +removed2);

    }
}
