package abstractpractice;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lacy");
        Cat cat = new Cat("");

        dog.printName();
        cat.printName();
        dog.makeSound();
        cat.makeSound();
    }
}
