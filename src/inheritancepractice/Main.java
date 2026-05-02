package inheritancepractice;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Garfield");
        dog.printName();
        dog.makeSound();
        cat.printName();
        cat.makeSound();

    }
}
