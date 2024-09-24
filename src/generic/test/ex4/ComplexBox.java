package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal>{ // 제네릭 타입

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }
    public <T> T printAndReturn(T t){ // 제네릭 메서드
        // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 갖기 때문에 여기서의 T 와 위에 T 는 다르다
        System.out.println("animal.className: " + animal.getClass());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
