package generic.test.ex3;

import generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal){
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target){
        // 삼항 연산자 사용 왼쪽이 크면 왼쪽 출력/ 오른쪽이 크면 오른쪽을 출력
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
