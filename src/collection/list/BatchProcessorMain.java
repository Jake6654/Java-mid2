package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        BatchProcessor2 batchProcessor1 = new BatchProcessor2(new MyArrayList<>());
        BatchProcessor2 batchProcessor2 = new BatchProcessor2(new MyLinkedList<>());

        batchProcessor1.logic(50000);
        batchProcessor2.logic(50000);

    }
}
