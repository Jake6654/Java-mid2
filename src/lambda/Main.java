package lambda;



public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Printable lambdaPrintable = () -> System.out.println("meow");
        printThing(lambdaPrintable);

    }
    static void printThing(Printable thing){
        thing.print();
    }
}
