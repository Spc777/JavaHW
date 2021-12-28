package lesson1.tasks;
import lesson1.participants.Participant;


public class Wall implements Task {

    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean performTask(Participant contestant) {
        System.out.printf("Высота стены %.1f м. ", height);
        boolean result = contestant.jump() > height;
        System.out.println("Участник " + (result ? "успешно " : "не ") + "перепрыгнул стену.");
        return result;
    }
}
