package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat>catHospital = new AnimalHospitalV3();

        Dog dog = new Dog("멍멍이1", 300);
        Cat cat1 = new Cat("cat1", 200);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat1);
        catHospital.checkUp();


        // 문제2: 개 타입 변환
        Dog biggerDog =  dogHospital.bigger(new Dog("멍멍2",400));
        System.out.println("BiggerDog = "+biggerDog);


    }
}

