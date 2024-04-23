package Homework3part2;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Human("Alice"), new Cat("Whiskers"), new Robot("Bender")};
        Obstacle[] obstacles = {new RunningTrack(100), new Wall(2)};

        for (Participant participant : participants) {
            boolean isParticipantStillInGame = true;
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof RunningTrack) {
                    if (!participant.run(((RunningTrack) obstacle).getLength())) {
                        isParticipantStillInGame = false;
                        break;
                    }
                } else if (obstacle instanceof Wall) {
                    if (!participant.jump(((Wall) obstacle).getHeight())) {
                        isParticipantStillInGame = false;
                        break;
                    }
                }
            }
            if (isParticipantStillInGame) {
                System.out.println("Participant " + participant.getName() + " passed all obstacles successfully.");
            } else {
                System.out.println("Participant " + participant.getName() + " was eliminated.");
            }
        }
    }
}








