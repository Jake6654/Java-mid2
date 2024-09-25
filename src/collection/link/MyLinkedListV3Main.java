package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> listV3 = new MyLinkedListV3<>(); // LinkedList 의 E 가 모두 String으로 변경
        listV3.add("a");
        listV3.add("b");
        // listV3.add(1); 제네릭을 String 으로 설정하여 오류 발생
        listV3.add("c");
        System.out.println(listV3);


    }

}
