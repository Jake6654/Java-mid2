package collection.list;

public class BatchProcessor1 {

    // 이 코드는 추상적인 개념보다 구체적인 ArrayList or linkedlist 에 의존하기 때문에
    // 리스트를 변경하고 싶을때 마다 코드를 직접 수정해야한다
    MyArrayList<Integer> list = new MyArrayList<>();

    public void logic(int size){ // arrayList 일 경우 느리다 linkedList 로 바꾸고 싶다
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
    }
}
