package collection.link;



public class MyLinkedListMainV1 {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("== add data ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("== use function ==");
        System.out.println("list.size() = " + list.size()); // 배열에 있는 데이터의 사이즈 를 반환
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = "  + list.indexOf("c"));
        System.out.println("list.set(2,'z') = " + list.set(2,"z"));

        System.out.println("== 범위 초과 ==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        // 범위 초과, capacity 가 늘어나지 않으면 예외 발생
        list.add("f");
        System.out.println(list);
    }
}
