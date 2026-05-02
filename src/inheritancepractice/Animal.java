package inheritancepractice;

public class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some sound");
    }

    public void printName() {
        System.out.println("My name is " + name);
    }
}
