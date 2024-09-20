package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 300);
        Cat cat1 = new Cat("cat1", 200);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat1);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat1); // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 변환
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍2",400));
        System.out.println("BiggerDog = "+biggerDog);


    }
}
