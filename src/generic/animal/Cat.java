package generic.animal;

public class Cat extends Animal {

    public Cat(String name, int size) {
        super(name, size); // 부모 클래스의
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
