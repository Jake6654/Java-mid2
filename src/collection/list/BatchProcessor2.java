package collection.list;

public class BatchProcessor2 {

    private final MyList<Integer> list; // 추상적인 MyList 인터페이스에 의존

    public BatchProcessor2(MyList<Integer> list) {
        this.list = list; // 객체 생성 시점에 My list 의 구현체를 전달 받아 무슨 list 를 쓸 지 결정
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간: " + (endTime - startTime) +"ms");

    }
}
