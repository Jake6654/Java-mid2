package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }
    // [A->B->C] 모든 노드 출력
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // 루프에서 문자를 더할 때는 StringBuilder 을 쓰기
        Node x = this; // 현재 노드(x001)
        sb.append("[");
        while (x != null){
            sb.append(x.item);
            if (x.next != null) { // 마지막엔 -> 넣지 않기
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");

        return sb.toString(); // StringBuilder type 의 sb 를 String 타입으로 변환 후 리턴
    }
}
