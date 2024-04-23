package Homework2;

class Cat extends Animal {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public void run(int length) {
        if (length <= 200) {
            System.out.println("Cat ran " + length + " m");
        } else {
            System.out.println("Cat can't run that far");
        }
    }

    public void swim(int length) {
        System.out.println("Cat can't swim");
    }

    public static int getCatCount() {
        return catCount;
    }
}

