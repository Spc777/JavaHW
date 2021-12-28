package lesson1;
import lesson1.participants.Participant;
import lesson1.participants.Cat;
import lesson1.participants.Human;
import lesson1.participants.Robot;
import lesson1.tasks.Task;
import lesson1.tasks.Track;
import lesson1.tasks.Wall;

import java.util.Random;

public class Tournament {

    private static final int taskAmount = 5;

    public static void main(String[] args) {

        Random random = new Random();

        Participant[] participants = {
                new Human("Петр", 800 + random.nextInt(600), 1 + random.nextDouble()),
                new Cat("Мурзик", 200 + random.nextInt(300), 3 + random.nextDouble()),
                new Robot("Boston", 800 + random.nextInt(200), .8 + random.nextDouble()),
        };

        Task[] tasks = new Task[taskAmount];
        for (int i = 0; i < taskAmount; i++) {
            if (random.nextInt(100) % 2 == 0) {
                tasks[i] = new Track(random.nextInt(1000));
            } else {
                tasks[i] = new Wall(0.5 + random.nextDouble() * 2);
            }
        }

        System.out.println("\nПрохождение препятствий\n");
        for (int i = 0; i < tasks.length; i++) {
            System.out.printf("Этап %d \n", i + 1);
            for (int j = 0; j < participants.length; j++) {
                if (participants[j] != null && !tasks[i].performTask(participants[j])) {
                    System.out.println("Участник выбывает из состязаний!");
                    participants[j] = null;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int winnerCount = 0;
        for (Participant participant : participants) {
            if (participant != null) {
                sb.append(", ").append(participant.getInfo());
                winnerCount++;
            }
        }
        String winnersInfo = sb.toString();

        System.out.println();
        if (winnerCount != 0) {
            System.out.printf("Осталось участников: %d \n" + winnersInfo, winnerCount);
        } else {
            System.out.println("Все участники выбыли из состязаний");
        }
        System.out.println();
    }
}
