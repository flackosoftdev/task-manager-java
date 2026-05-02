package abstractpractice;

public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    abstract void makeSound();
}
