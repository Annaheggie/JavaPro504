package Homework3part2;

class Robot extends Participant {
    public Robot(String name) {
        super(name);
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Robot " + getName() + " runs " + distance + " meters.");
        return false; // For simplicity, robots never pass the obstacle
    }

    @Override
    public boolean jump(int height) {
        System.out.println("Robot " + getName() + " tries to jump over a " + height + " meter wall.");
        return false; // For simplicity, robots never pass the obstacle
    }
}

