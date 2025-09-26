class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Parrot", 1);
        
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}