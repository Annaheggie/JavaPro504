package Homework3part2;

abstract class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean run(int distance);

    public abstract boolean jump(int height);
}

