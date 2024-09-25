package collection.link;


public class MyLinkedListV3 <E> {

    private Node<E> first;
    private int size = 0;


    public void add(E e){
        Node<E> node = new Node(e); // E 타입(제네릭타입) 의 노드에 e 라는 아이템을 갖고있는 노드 생성
        if (first == null) { // O(1)
            first = node;
            size++;
        }else {
            Node<E> lastNode = getLastNode(); // 노드에 마지막에 값을 추가 O(n)
            lastNode.next = node;
            size++;
        }
    }

    // 추가 코드
    public void add(int index, E o){
        Node<E> newNode = new Node(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else{
        Node<E> prev = getNode(index -1);
        newNode.next = prev.next;
        prev.next = newNode;
        }
        size++;
    }

    public E remove(int index){
        Node<E> removedNode = getNode(index);
        E removedVal = removedNode.item;
        if (index == 0){
            first = removedNode.next;
        } else {
            Node<E> prev = getNode(index-1);
            prev.next = prev.next.next;
        }
        removedNode.next = null;
        removedNode.item = null;
        size--;
        return removedVal;
    }

    public int size() {
        return size;
    }

    public Node getNode(int index){
        Node<E> x = first;
        for (int i = 0; i < index; i++) { // O(n)
            x = x.next;
        }
        return x;
    }

    public Node<E> getLastNode(){ // O(n)
        Node<E> x = first;
        while ( x.next !=  null){
            x = x.next;
        }
        return x;
    }

    public E set (int index, E element){ // O(n)
        Node<E> x = getNode(index);
        E oldValue = x.item; // 옛날 값 반환을 위해 저장
        x.item = element; // item update
        return oldValue;
    }

    public E get(int index){ // O(n)
        Node<E> node = getNode(index);
        return node.item;
    }

    public int indexOf(E o){ // O(n)
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next){
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

    private static class Node<E>{
        E item; // 같은 타입의 아이템을 생성해야 하기 때문에 제네릭 노드를 사용
        Node<E> next; // 같은 타입의 제네릭 노드를 참조

        public Node(E item) {
            this.item = item;
        }

        // [A->B->C] 모든 노드 출력
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this; // 현재 노드(x001)
            sb.append("[");
            while (x != null){
                sb.append(x.item);
                if (x.next != null) { // 마지막엔 -> 넣지 않기
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
}
