package generic.animal;

public class Dog extends Animal {

    public Dog(String name, int size){
        // 자식 클래스에서 super 을 사용하게 되면 부모 클래스의 생성자가 호출 되는데
        // 자식 클래스에서 전달 받은 매개변수가 부모 클래스의 생성자의 매개변수로 넘겨진다
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
