package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog1",100);
        Cat cat = new Cat("cat1",80);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog targetDog = new Dog("dog2",120);
        // 고양이와 강아지를 비교하는것은 불가능하다 (타입추론으로 Dog 생략가능)
        System.out.println("bigger = " + AnimalMethod.<Dog>bigger(dog, targetDog));
    }
}
