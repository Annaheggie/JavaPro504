package Homework3part2;

class Cat extends Participant {
    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Cat " + getName() + " runs " + distance + " meters.");
        return true; // For simplicity, cats always pass the obstacle
    }

    @Override
    public boolean jump(int height) {
        System.out.println("Cat " + getName() + " jumps over a " + height + " meter wall.");
        return true; // For simplicity, cats always pass the obstacle
    }
}

