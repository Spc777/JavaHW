package hw6;


import java.util.Random;

public class Dog extends Animal {
    private float runDistance;
    private float swimDistance;

    public Dog(String name, String color, float age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDistance = 500;
        this.swimDistance = 10;
    }

    @Override
    public String toString() {
        return "Собака {" +
                "кличка = '" + this.name + '\'' +
                ", окрас = '" + this.color + '\'' +
                ", возраст = " + this.age + " лет" +
                ", может пробежать " + this.runDistance + " м" +
                ", может проплыть " + this.swimDistance + " м" +
                '}';
    }

    @Override
    public boolean run(float distance) {
        return !(distance > this.runDistance && distance > 0);
    }

    @Override
    public boolean swim(float distance) {
        return !(distance > this.swimDistance && distance > 0);
    }


}
