package generic.test;

public class Container <T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public boolean isEmpty(){
        // 검증 로직
        if (item == null ){
            return true;
        }
        return false;
    }
}
