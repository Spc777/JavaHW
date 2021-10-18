package hw6;

import java.util.Random;

public class Cat extends Animal {
    private int runDistance;
    private int swimDistance;

    public Cat(String name, String color, float age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDistance = 200;
        this.swimDistance = 0;
    }
/*
    public float getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public float getSwimDistance() {
        return swimDistance;
    }
*/

    @Override
    public String toString() {
        return "Кот {" +
                "кличка = '" + this.name + '\'' +
                ", окрас = '" + this.color + '\'' +
                ", возраст = " + this.age + " лет" +
                ", может пробежать " + this.runDistance + " м" +
                ", не может плавать" +
                '}';
    }

    @Override
    public boolean swim(float distance) {
        return false;
    }

    @Override
    public boolean run(float distance) {
        return !(distance > this.runDistance && distance > 0);
    }

}