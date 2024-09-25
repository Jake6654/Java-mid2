package collection.link;



public class MyLinkedListMainV2 {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("== add data ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.addAtIndex(1,"e");
        System.out.println(list);
    }
}
