package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("\"A\".hashCode() = " + "A".hashCode());
        System.out.println("\"B\".hashCode() = " + "B".hashCode());
        System.out.println(set);

        // 검색
        String searchValue = "A";
        boolean contains = set.contains(searchValue);
        System.out.println("set.contains (" + searchValue +") = "+ contains);

    }
}
