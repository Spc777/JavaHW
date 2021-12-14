package lesson1.participants;

public class Robot implements Participant {
    private final String name;
    private final int runMaxDistance;
    private final double jumpMaxHeight;

    public Robot(String name, int runMaxDistance, double jumpMaxHeight) {
        this.name = name;
        this.runMaxDistance = runMaxDistance;
        this.jumpMaxHeight = jumpMaxHeight;
    }

    @Override
    public String getInfo() {
        return "Робот " + name;
    }

    @Override
    public int run() {
        System.out.printf("%s %s может пробежать %d м. ", "Робот", name, runMaxDistance);
        return runMaxDistance;
    }

    @Override
    public double jump() {
        System.out.printf("%s %s может прыгнуть на %.1f м. ", "Робот", name, jumpMaxHeight);
        return jumpMaxHeight;
    }
}
