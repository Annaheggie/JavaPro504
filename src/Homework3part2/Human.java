package Homework3part2;

class Human extends Participant {
    public Human(String name) {
        super(name);
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Human " + getName() + " runs " + distance + " meters.");
        return true; // For simplicity, humans always pass the obstacle
    }

    @Override
    public boolean jump(int height) {
        System.out.println("Human " + getName() + " jumps over a " + height + " meter wall.");
        return true; // For simplicity, humans always pass the obstacle
    }
}

