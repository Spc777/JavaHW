package lesson1.tasks;

import lesson1.participants.Participant;

public class Track implements Task {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean performTask(Participant participant) {

        System.out.printf("Длина беговой дорожки %d м. ", length);
        boolean result = participant.run() > length;

        System.out.println("Участник " + (result ? "успешно " : "не ") + "пробежал дистанцию.");
        return result;

    }
}
