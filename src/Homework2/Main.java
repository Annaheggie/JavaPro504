package Homework2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog1.run(300);
        dog1.swim(5);

        cat1.run(150);
        cat1.swim(3);

        System.out.println("Total Dogs: " + Dog.getDogCount());
        System.out.println("Total Cats: " + Cat.getCatCount());
    }
}