package lesson1.participants;

public class Human implements Participant {
    private final String name;
    private final int runMaxDistance;
    private final double jumpMaxHeight;

    public Human(String name, int runMaxDistance, double jumpMaxHeight) {
        this.name = name;
        this.runMaxDistance = runMaxDistance;
        this.jumpMaxHeight = jumpMaxHeight;
    }

    @Override
    public String getInfo() {
        return "Человек " + name;
    }

    @Override
    public int run() {
        System.out.printf("%s %s может пробежать %d м. ", "Человек", name, runMaxDistance);
        return runMaxDistance;
    }

    @Override
    public double jump() {
        System.out.printf("%s %s может прыгнуть на %.1f м. ", "Человек", name, jumpMaxHeight);
        return jumpMaxHeight;
    }
}
