package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);
        
        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("LastNode= " + lastNode.item);

        // 특정 인덱스의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first,index);
        System.out.println(index2Node);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first,"D" );
        System.out.println(first);
        add(first,"E" );
        System.out.println(first);
        add(first,"F" );
        System.out.println(first);

    }

    private static void add(Node node, String d) {
        Node lastNode = getLastNode(node); // 마지막 노드를 찾고 새로운 노드를 추가
        lastNode.next = new Node(d);

    }

    private static Node getNode(Node node, int index){
            Node x = node; // temp 와 비슷한 것
        for (int i = 0; i < index; i++) {
             x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null){
            x= x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }
}
