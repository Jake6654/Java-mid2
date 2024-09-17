package generic.test;

public class Pair <T, S>{
    // 한번에 여러 타입의 매개변수를 선언할 수 있다
    // 하지만 다른 문자를 써야함 T,S 같이

    private T first;
    private S second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
