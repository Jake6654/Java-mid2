package collection.link;

import generic.test.Pair;



public class MyLinkedListV1 {

    private Node first;
    private int size = 0;


    public void add(Object e){
        Node node = new Node(e); // e 라는 오브젝트 타입의 item 을 갖고 있는 노드를 생성
        if (first == null) { // O(1)
            first = node;
            size++;
        }else {
            Node lastNode = getLastNode(); // 노드에 마지막에 값을 추가 O(n)
            lastNode.next = node;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public Node getNode(int index){
        Node x = first;
        for (int i = 0; i < index; i++) { // O(n)
            x = x.next;
        }
        return x;
    }

    public Node getLastNode(){ // O(n)
        Node x = first;
        while ( x.next !=  null){
            x = x.next;
        }
        return x;
    }

    public Object set (int index, Object element){ // O(n)
        Node x = getNode(index);
        Object oldValue = x.item; // 옛날 값 반환을 위해 저장
        x.item = element; // item update
        return oldValue;
    }

    public Object get(int index){ // O(n)
        Node node = getNode(index);
        return node.item;
    }

    public int indexOf(Object o){ // O(n)
        int index = 0;
        for (Node x = first; x != null; x = x.next){
            if (x.item.equals(o)){ // 객체의 값 비교는 equals
                return index;
            }
            index++;
        }
        return -1; // 못 찾았을때
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
