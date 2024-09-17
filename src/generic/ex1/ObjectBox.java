package generic.ex1;

public class ObjectBox { // 오브젝트는 모두의 부모이기 때문에 모든 것을 담을 수 있다
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
