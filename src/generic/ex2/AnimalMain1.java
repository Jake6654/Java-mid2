package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",0);
        Dog dog = new Dog("dog",100);
        Cat cat = new Cat("Cat", 60);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog); // Dog 타입의 인자를 전달
        Dog findDog = dogBox.getValue();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        Cat findCat = catBox.getValue();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>(); // Animal type 을 타입 매개변수로 받았기 때문에
        // 그의 하위 클래스인 Cat 과 Dog 또한 인자로
        animalBox.setValue(animal);
        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal = " + findAnimal);

        // 당연히 그의 하위 클래스인 Cat 과 Dog 또한 인자로 받을 수 있다
        animalBox.setValue(dog);
        animalBox.setValue(cat);



    }
}
