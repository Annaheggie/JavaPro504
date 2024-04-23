package Homework2;

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    public void run(int length) {
        if (length <= 500) {
            System.out.println("Dog ran " + length + " m");
        } else {
            System.out.println("Dog can't run that far");
        }
    }

    public void swim(int length) {
        if (length <= 10) {
            System.out.println("Dog swam " + length + " m");
        } else {
            System.out.println("Dog can't swim that far");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}